package Collection;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    String itemName;

    List list=new ArrayList();

    /*ShoppingCart(String itemName){
        this.itemName=itemName;

    }*/

    void isAvailable(String itemName)
    {
        if(itemName.equals("Kindle") || itemName.equals("Iphone"))
            System.out.println("Sorry ! It is out of stock");
        else
        {
            list.add(itemName);
            System.out.println("Added to cart !");
        }
    }

    void displayList(String input)
    {
        if(input.equals("Y") || input.equals("y"))
            System.out.println("Your shopping cart :" +list);
    }

}
