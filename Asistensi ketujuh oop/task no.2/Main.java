class Main {
    public static void main(String[] args) {
        Product<Integer> produk1 = new Product<>("Yakult", 2, "05-10-2023");
        Product<String> produk2 = new Product<>("Kiranti", "$3", "29-03-2023");
        Product<Double> produk3 = new Product<>("Ultra Milk", 5.99, "01-06-2023");

        System.out.println("Product 1: " + produk1.getName() + " - " + produk1.getHarga() + " - " + produk1.getExpiryDate());
        System.out.println("Product 2: " + produk2.getName() + " - " + produk2.getHarga() + " - " + produk2.getExpiryDate());
        System.out.println("Product 2: " + produk3.getName() + " - " + produk3.getHarga() + " - " + produk3.getExpiryDate());
    }
}