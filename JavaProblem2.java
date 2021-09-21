import java.util.Scanner;

public class JavaProblem2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int val = sc.nextInt();

        int ori=val;
        int count = 0;
        while (val != 0) {
            val = val / 10;
            ++count;
        }

        System.out.println(ori +" is a "+ count +" digit number .");
        int result=0;

        if(count<2)
            result=count;
        else if(count%2==0)
            result=count*count;
        else if(count % 3==0)
            result=count*count*count;
        else
            result=(count-1)*(count-1);

        System.out.println(result);
    }
}
