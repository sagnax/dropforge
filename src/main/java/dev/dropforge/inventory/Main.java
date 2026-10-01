package dev.dropforge.inventory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "RTX 5090";
        product1.stock = 10;
        product1.maxPerCustomer = 3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantity:");
        int requestedQuantity = scanner.nextInt();

        //product1.maxPerCustomer = null;

        if (product1.stock >= requestedQuantity &&
                (product1.maxPerCustomer == null || requestedQuantity <= product1.maxPerCustomer)) {
            System.out.println("Permitido");
        }
        else {
            System.out.println("Não Permitido");
        }
        scanner.close();
    }
}
