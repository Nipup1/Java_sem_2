package Practic_6_6.Builder;

public class ConcreteBuilder implements Builder {
    private Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildPart1() {
        product.setPart1("Жариков");
    }

    @Override
    public void buildPart2() {
        product.setPart2("Николай");
    }

    @Override
    public void buildPart3() {
        product.setPart3("Павлович");
    }

    @Override
    public Product getProduct() {
        return product;
    }
}
