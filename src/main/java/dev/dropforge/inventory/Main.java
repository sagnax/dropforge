package dev.dropforge.inventory;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "Grape Koolaid";
        product1.stock = 10;
        product1.price = 9.99f;

        Product product2 = product1;
        product2.stock -= 1;

        System.out.println(product1.stock);
    }
}
