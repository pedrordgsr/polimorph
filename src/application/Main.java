package application;

import entities.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of products: ");

        int qnt = sc.nextInt();

        for(int i = 1;i <= qnt;i++){
            System.out.println("Enter product number " + 1 +" info");
            System.out.println("Common or imported? (c/i)");
            char type = sc.next().charAt(0);
            if (type == 'c'){
                System.out.println("Type the product name: ");
                String name = sc.nextLine();
                System.out.println("Type the product price: ");
                Double price = sc.nextDouble();

                Product prod = new Product(name,price);
            }
        }


    }
}