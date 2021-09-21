import java.util.Scanner;

public class JavaProblem3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number :");
        double val=sc.nextDouble();


        if(val % 1 !=0)
        {
            if(val>-3.4*Math.pow(10,38) && val<3.4*Math.pow(10,38))
                System.out.println("You can use float or double  but float is recommended");
            else   if(val>-1.7*Math.pow(10,308) && val<1.7*Math.pow(10,308))
                System.out.println("You can use float or double  but double is recommended");
            else
                System.out.println("Invalid input");
        }
        else
        {
            if(val>-Math.pow(2,(8-1)) && val<(Math.pow(2,(8-1))-1))
                System.out.println("You can use byte,short,int or long  but byte is recommended");
            else if(val>-Math.pow(2,(16-1)) && val<(Math.pow(2,(16-1))-1))
                System.out.println("You can use byte,short,int or long  but short is recommended");
            else if(val>-Math.pow(2,(32-1)) && val<(Math.pow(2,(32-1))-1))
                System.out.println("You can use byte,short,int or long  but int is recommended");
            else if(val>-Math.pow(2,(64-1)) && val<(Math.pow(2,(64-1))-1))
                System.out.println("You can use byte,short,int or long  but long is recommended");
            else
                System.out.println("Invalid input");
        }
        
    }
}
