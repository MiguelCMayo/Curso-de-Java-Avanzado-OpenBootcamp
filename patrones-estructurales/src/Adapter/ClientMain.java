package Adapter;

public class ClientMain {

    public static void main(String[] args) {

        UserAdapterImpl adapter = new UserAdapterImpl();
        adapter.getUser(2);

    }
}
