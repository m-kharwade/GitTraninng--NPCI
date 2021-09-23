package String;

import java.util.Scanner;

public class InventoryMain {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String productName="";

        while (true)
        {
            System.out.println("\nProduct List:");
            System.out.println("--------------");
            StringBuilder sb=new StringBuilder();
            sb.append("1.IPhone");
            sb.append("\n2.Laptop");
            sb.append("\n3.Mouse");
            sb.append("\n4.Hard Drive");

            System.out.println(sb);

            System.out.println("What you would like to buy?");
            productName=sc.nextLine();

            InventoryProducts products=new InventoryProducts();
            products.getLowestSeller(productName);


        }


    }
}
