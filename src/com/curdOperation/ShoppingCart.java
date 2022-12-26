package com.curdOperation;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        Map<Integer, Product> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("1.Add Product");
            System.out.println("2.Display Product");
            System.out.println("3.Delete product");
            System.out.print("Please enter your choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    Product p1 = new Product("Pencil", 1001, 1);
                    Product p2 = new Product("Pen", 1002, 2);
                    Product p3 = new Product("Book", 1003, 3);
                    Product p4 = new Product("Chair", 1004, 4);
                    Product p5 = new Product("Table", 1005, 5);
                    //adding values to map
                    map.put(p1.getKey(), p1);
                    map.put(p2.getKey(), p2);
                    map.put(p3.getKey(), p3);
                    map.put(p4.getKey(), p4);
                    map.put(p5.getKey(), p5);
                    Iterator<Integer> itr = map.keySet().iterator();
                    while (itr.hasNext()) {
                        int key = (int) itr.next();
                        System.out.println("id: " + key + "     name: " + map.get(key));
                        break;
                        case 2:
                            System.out.println("--------------------------------------");
                            while (itr.hasNext()) {
                                key = (int) itr.next();
                                System.out.println("id: " + key + "     name: " + map.get(key));
                            }
                            System.out.println("--------------------------------------");
                            break;
                    }

            }
        }
    }
}




