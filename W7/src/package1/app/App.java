package package1.app;

import package1.data.Product;

public class App{
    public static void main(String[]args){
        Product product = new Product("Samsung",4000000);

        System.out.println(product.name);
        System.out.println(product.price);
    }
}