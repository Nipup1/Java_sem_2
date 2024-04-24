package Practic_7_6.Deputy;

public class Client {
    public boolean access;

    public Client(boolean access) {
        this.access = access;
    }

    public void set_task(Deputy deputy){
        deputy.get_access(access);
    }
}
