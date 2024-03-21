public class Product {
    private final ProductType productType;
    private final Color color;
    private final Manufacturer manufacturer;
    final double price;

    private Product(Builder builder) {
        this.productType = builder.productType;
        this.color = builder.color;
        this.manufacturer = builder.manufacturer;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return String.format("Product: %s, Manufacturer: %s, Color: %s, Price: $%.2f",
                productType, manufacturer, color, price);
    }

    public static class Builder {
        private final ProductType productType;
        private Color color;
        private Manufacturer manufacturer;
        private double price;

        public Builder(ProductType productType) {
            this.productType = productType;
        }

        public Builder withColor(Color color) {
            this.color = color;
            return this;
        }

        public Builder withManufacturer(Manufacturer manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder withPrice(double price) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
