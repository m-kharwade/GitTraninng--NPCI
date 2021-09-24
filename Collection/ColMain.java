package Collection;

import java.util.Scanner;

public class ColMain {

    public static void main(String[] args) {

        AvailableItems items=new AvailableItems();

        Scanner scanner=new Scanner(System.in);
        String itemName="";
        String shoppigList="";

        while(true)
        {
            System.out.println("Shopping Cart");
            System.out.println("---------------");
            items.getItems();
            System.out.println("What you would like to buy?");
            itemName=scanner.nextLine();

            ShoppingCart cart=new ShoppingCart();
            cart.isAvailable(itemName);

            System.out.println("Would you like to buy other items ?");
            itemName=scanner.nextLine();
            cart.isAvailable(itemName);

            System.out.println("Do you want to see your shopping list ? Y/N");
            shoppigList=scanner.nextLine();
            cart.displayList(shoppigList);

       }
    }


}
