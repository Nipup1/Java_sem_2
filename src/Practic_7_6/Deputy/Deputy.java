package Practic_7_6.Deputy;

public class Deputy {
    public Server server = new Server();
    public void get_access(boolean access){
        if(access) System.out.println(server);
        else System.out.println("You not admin");
    }
}
