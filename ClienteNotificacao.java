import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClienteNotificacao extends Remote {
    void notificar(String mensagem) throws RemoteException;
}
