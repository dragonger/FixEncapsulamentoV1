package Progan;

import Entities.Product;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ac;
        String name;
        String r;
        double balance= 0;

        System.out.println("Enter the account number: ");
        ac = sc.nextInt();

        System.out.println("Enter holder name: ");
        name = sc.next();

        System.out.println("Is there a initial deposit?");
        r=sc.next();

        Product product= new Product(ac,name,balance);

        if (Objects.equals(r, "s")) {
            System.out.println("Enter the initial deposit");
            balance= sc.nextDouble();
            product.adddeposit(balance);
        }


        System.out.println("Account data:\n"+product);

        System.out.println("Enter a deposit value:");

        balance= sc.nextDouble();
        product.adddeposit(balance);

        System.out.println("Update account data:\n"+ product);
        System.out.println("Enter whithdrawn value");

        balance = sc.nextDouble();
        product.whithdrawn(balance);

        System.out.println("Updated account data:\n"+product);

    }


}
