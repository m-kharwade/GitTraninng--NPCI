import java.util.Scanner;

public class JavaProb1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the first value :");
        int firstValue=scanner.nextInt();

        System.out.println("Enter the Second value :");
        int secondValue=scanner.nextInt();


        if(firstValue % 2==0)
        {
            if(firstValue * firstValue==secondValue && secondValue % firstValue==0)
                System.out.println(secondValue +" is square and multiple of " +firstValue);
            else if(firstValue * firstValue==secondValue)
                System.out.println(secondValue+" is a square of " +firstValue);
             else if(secondValue % firstValue==0)
                System.out.println(secondValue +" is a multiple of " +firstValue);
             else
                System.out.println(secondValue +" is neither square nor multiple of " +firstValue);
        }
        else
        {
            System.out.println(firstValue+" is not even");
        }

    }
}
