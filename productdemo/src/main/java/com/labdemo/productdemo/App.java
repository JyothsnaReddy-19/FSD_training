package com.labdemo.productdemo;

 

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductDAO dao = new ProductDAO();

        while (true) {

            System.out.println("\n===== PRODUCT MENU =====");
            System.out.println("1. Insert Product");
            System.out.println("2. Find All Products");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                Product p1 = new Product();

                System.out.print("Enter Product Id: ");
                p1.setPid(sc.nextInt());

                sc.nextLine();

                System.out.print("Enter Product Name: ");
                p1.setPname(sc.nextLine());

                System.out.print("Enter Product Price: ");
                p1.setPrice(sc.nextDouble());

                dao.save(p1);

                System.out.println("Product Inserted Successfully");
                break;

            case 2:

                List<Product> products = dao.findAll();

                if (products.isEmpty()) {
                    System.out.println("No Products Found");
                } else {
                    for (Product p : products) {
                        System.out.println(p);
                    }
                }

                break;

            case 3:

                Product p2 = new Product();

                System.out.print("Enter Product Id: ");
                p2.setPid(sc.nextInt());

                sc.nextLine();

                System.out.print("Enter New Product Name: ");
                p2.setPname(sc.nextLine());

                System.out.print("Enter New Product Price: ");
                p2.setPrice(sc.nextDouble());

                dao.update(p2);

                System.out.println("Product Updated Successfully");
                break;

            case 4:

                System.out.print("Enter Product Id: ");
                int deleteId = sc.nextInt();

                dao.delete(deleteId);

                break;

            case 5:

                System.out.println("Exiting Application...");
                sc.close();
                System.exit(0);

            default:

                System.out.println("Invalid Choice");
            }
        }
    }
}
