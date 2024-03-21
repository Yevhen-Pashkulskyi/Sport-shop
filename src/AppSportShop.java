public class AppSportShop {
    public static void main(String[] args) {
        Product redTShirt = new Product.Builder(ProductType.T_SHIRT)
                .withColor(Color.RED)
                .withManufacturer(Manufacturer.ACTIVE_SPORTS)
                .withPrice(19.99)
                .build();

        Product whiteCap = new Product.Builder(ProductType.CAP)
                .withColor(Color.WHITE)
                .withManufacturer(Manufacturer.SMART_CAPS)
                .withPrice(9.99)
                .build();

        Product blueTShirt = new Product.Builder(ProductType.T_SHIRT)
                .withColor(Color.BLUE)
                .withManufacturer(Manufacturer.ACTIVE_SPORTS)
                .withPrice(19.99)
                .build();

        Product blackCap = new Product.Builder(ProductType.CAP)
                .withColor(Color.BLACK)
                .withManufacturer(Manufacturer.SMART_CAPS)
                .withPrice(9.99)
                .build();

        Order orderA = new Order(redTShirt, whiteCap);
        Order orderB = new Order(blueTShirt, blackCap);

        System.out.println("Order A:\n" + orderA);
        System.out.println("\nOrder B:\n" + orderB);
    }
}
