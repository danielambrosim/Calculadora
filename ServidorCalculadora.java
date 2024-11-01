import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.RemoteException;
import java.util.List;
import java.util.ArrayList;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.io.File;
import java.io.IOException;
import com.google.ServidorCalculadora;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Desktop;

public class ServidorCalculadora extends UnicastRemoteObject implements Calculadora {
    private List<ClienteNotificacao> clientes;

    public ServidorCalculadora() throws RemoteException {
        super();
        clientes = new ArrayList<>();
    }

    public void registrarCliente(ClienteNotificacao cliente) throws RemoteException {
        clientes.add(cliente);
    }

    private void notificarClientes(String mensagem) {
        for (ClienteNotificacao cliente : clientes) {
            try {
                cliente.notificar(mensagem);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
        }
    }

    private void gerarQRCode(String texto, String filePath) {
    QRCodeWriter qrCodeWriter = new QRCodeWriter();
    int width = 300;
    int height = 300;
    try {
        BitMatrix bitMatrix = qrCodeWriter.encode(texto, BarcodeFormat.QR_CODE, width, height);
        Path path = FileSystems.getDefault().getPath(filePath);
        MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
        System.out.println("QR Code gerado: " + filePath);
        
        // Exibir imagem no terminal
        BufferedImage image = ImageIO.read(new File(filePath));
        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.OPEN)) {
            Desktop.getDesktop().open(new File(filePath));
        }
    } catch (WriterException | IOException e) {
        e.printStackTrace();
    }
}


    public int soma(int a, int b) throws RemoteException {
        int resultado = a + b;
        notificarClientes("Soma: " + a + " + " + b + " = " + resultado);
        return resultado;
    }

    public int subtrai(int a, int b) throws RemoteException {
        int resultado = a - b;
        notificarClientes("Subtração: " + a + " - " + b + " = " + resultado);
        return resultado;
    }

    public int multiplica(int a, int b) throws RemoteException {
        int resultado = a * b;
        notificarClientes("Multiplicação: " + a + " * " + b + " = " + resultado);
        return resultado;
    }

    public double divide(int a, int b) throws RemoteException {
        if (b == 0) throw new ArithmeticException("Divisão por zero");
        double resultado = (double) a / b;
        notificarClientes("Divisão: " + a + " / " + b + " = " + resultado);
        return resultado;
    }

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.createRegistry(1099);
            ServidorCalculadora servidor = new ServidorCalculadora();
            registry.rebind("Calculadora", servidor);
            System.out.println("Servidor de calculadora pronto.");
            String link = "rmi://localhost:1099/Calculadora";
            servidor.gerarQRCode(link, "qrcode.png");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
