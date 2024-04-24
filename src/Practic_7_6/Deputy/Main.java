package Practic_7_6.Deputy;

public class Main {
    public static void main(String[] args) {
        Deputy deputy = new Deputy();
        Client client1 = new Client(true);
        Client client2 = new Client(false);

        client1.set_task(deputy);
        client2.set_task(deputy);
    }
}
