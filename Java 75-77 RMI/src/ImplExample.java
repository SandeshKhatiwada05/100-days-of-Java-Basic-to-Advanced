import java.rmi.RemoteException;

public class ImplExample implements Hello{

    @Override
    public void printMsg() throws RemoteException {
        System.out.println("Hello RMI From Saisa");
    }
}
