import java.util.Scanner;

public class JavaProblem4 {

    public static void reverseFibonacci(int n)
    {
        int [] input=new int[101];

        input[0]=0;
        input[1]=1;

        for(int i=2;i<n;i++)
        {
            input[i]=input[i-2]+input[i-1];

        }

        for(int i=n-1;i>=0;i--)
            System.out.print(input[i]+"\t");
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        reverseFibonacci(size);

    }
}
