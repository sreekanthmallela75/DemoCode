package com.curdOperation;

import java.util.*;

public class StoreProduct {

    public static void main(String[] args) {
        ArrayList<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1.Add product");
            System.out.println("2.Display product");
            System.out.println("3.Search product");
            System.out.println("4.delete product");
            System.out.println("5.Update product");
            System.out.println("Enter your option");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
            }
            System.out.println("Enter your product name");
            String name = sc.next();
            System.out.println("Enter your product id");
            int id = sc.nextInt();
            System.out.println("Enter your product Price");
            float price = sc.nextFloat();
            list.add(new Product(name, id, Price));
            break;


            case 2:
                System.out.println();
                Iterator<Product> itr = list.iterator();
                while ((itr.hasNext())) {
                    System.out.println(itr.next());
                }
                System.out.println();
                break;
        } while (choice != 6);
    }

    }












