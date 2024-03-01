package org.example.Java.OOPLab4;

public class InheritsProduct{
    public static void main(String[] args) {
        Product productMain = new Product();
        Product product = productMain.inputData("Laptop", 1000, 10);
        productMain.displayData(product);
        System.out.println("Tax fee: " + productMain.calculateTax(product.getPrice(), product.getTax()));
    }
}
