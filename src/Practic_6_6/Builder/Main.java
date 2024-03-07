package Practic_6_6.Builder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        director.construct();

        Product product = builder.getProduct();
        product.show();
    }
}
