package Practic_7_6.LightWeight;

public class Main {
    public static void main(String[] args) {
        TypeStydent isStyde = new TypeStydent(true);
        Stydent stydent1 = new Stydent(10, "Nick", isStyde);
        Stydent stydent2 = new Stydent(22, "Rudo", isStyde);
        System.out.println(stydent1);
        System.out.println(stydent2);
    }
}
