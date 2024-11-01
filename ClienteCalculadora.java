import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class ClienteCalculadora extends UnicastRemoteObject implements ClienteNotificacao {
    public ClienteCalculadora() throws RemoteException {
        super();
    }

    @Override
    public void notificar(String mensagem) throws RemoteException {
        System.out.println("Notificação: " + mensagem);
    }

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            Calculadora calc = (Calculadora) registry.lookup("Calculadora");

            ClienteCalculadora cliente = new ClienteCalculadora();
            UnicastRemoteObject.exportObject(cliente, 0);
            ((ServidorCalculadora) calc).registrarCliente(cliente);

            System.out.println("Soma: " + calc.soma(5, 3));
            System.out.println("Subtração: " + calc.subtrai(5, 3));
            System.out.println("Multiplicação: " + calc.multiplica(5, 3));
            System.out.println("Divisão: " + calc.divide(5, 3));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
