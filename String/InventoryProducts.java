package String;

import java.util.Scanner;

public class InventoryProducts {

    Seller1 seller1=new Seller1();
    Seller2 seller2=new Seller2();
    Scanner sc=new Scanner(System.in);

    void getLowestSeller(String productName){

        switch(productName){
            case "IPhone":      if(seller1.iphonePrice<seller2.iphonePrice)
                                {
                                        System.out.println(productName+" is at Price "+seller1.iphonePrice +" from seller 1.");
                                }
                                else
                                {
                                    System.out.println(productName+" is at Price "+seller2.iphonePrice +" from seller 1.");
                                }
                                display(productName);
                                break;

            case "Laptop":      if(seller1.laptopPrice<seller2.laptopPrice)
                                 {
                                     System.out.println(productName+" is at Price "+seller1.laptopPrice +" from seller 1.");
                                 }
                                 else
                                {
                                     System.out.println(productName+" is at Price "+seller2.laptopPrice +" from seller 1.");
                                }
                                display(productName);
                                break;

            case "Mouse":       if(seller1.mousePrice<seller2.mousePrice)
                                {
                                    System.out.println(productName+" is at Price "+seller1.mousePrice +" from seller 1.");
                                }
                                else
                                {
                                    System.out.println(productName+" is at Price "+seller2.mousePrice +" from seller 1.");
                                }
                                display(productName);
                                break;

            case "Hard Drive":   if(seller1.hdPrice<seller2.hdPrice)
                                {
                                    System.out.println(productName+" is at Price "+seller1.hdPrice +" from seller 1.");
                                }
                                 else
                                {
                                    System.out.println(productName+" is at Price "+seller2.hdPrice +" from seller 1.");
                                }
                                display(productName);
                                break;

            default :
                System.out.println("Please enter valid input !");
        }


    }

    public void display(String productName){
        System.out.println("Would you like to see prices from all seller ? Y/N");
        String input=sc.nextLine();
        if(input.equals("Y") || input.equals("y"))
            displayAllPrices(productName);
    }

    void displayAllPrices(String productName){

            switch(productName){
                case "IPhone":  System.out.println(productName+" is at Price "+seller1.iphonePrice +" from seller 1.");
                                System.out.println(productName+" is at Price "+seller2.iphonePrice +" from seller 2.");
                                break;

                case "Laptop":
                    System.out.println(productName+" is at Price "+seller1.laptopPrice +" from seller 1.");
                    System.out.println(productName+" is at Price "+seller2.laptopPrice +" from seller 2.");
                    break;

                case "Mouse":
                    System.out.println(productName+" is at Price "+seller1.mousePrice +" from seller 1.");
                    System.out.println(productName+" is at Price "+seller2.mousePrice +" from seller 2.");
                    break;

                case "Hard Drive":
                    System.out.println(productName+" is at Price "+seller1.hdPrice +" from seller 1.");
                    System.out.println(productName+" is at Price "+seller2.hdPrice +" from seller 2.");
                    break;

                default :
                    System.out.println("Please enter valid input !");
            }

    }





}
