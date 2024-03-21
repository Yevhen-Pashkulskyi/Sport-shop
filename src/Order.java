public class Order {
    private final Product tShirt;
    private final Product cap;

    public Order(Product tShirt, Product cap) {
        this.tShirt = tShirt;
        this.cap = cap;
    }

    public double getTotalPrice() {

        return Math.ceil((tShirt.price + cap.price) * Math.pow(10, 2)) / Math.pow(10, 2);
    }

    @Override
    public String toString() {
        return "Order details:\n" + tShirt + "\n" + cap +
                "\nTotal Price: $" + getTotalPrice();
    }
}
