public enum ProductType {
    T_SHIRT("T-shirt"),
    CAP("Cap");
    private final String name;

    ProductType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
