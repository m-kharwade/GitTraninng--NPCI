public class JavaProblem10 {


   static int [] a=new int[10];
   static int size=a.length;
   static int i=2;

    static void method1(){

        if(size!=0)
        {
            System.out.print(a[i]=a[i-2]+a[i-1]);
            System.out.print("\t");
            size--;
            i++;
            method2();
        }
    }

    static void method2(){

        try{

            if(size!=3)
            {
                System.out.print(a[i]=a[i-2]+a[i-1]);
                System.out.print("\t");
                size--;
                i++;
                method1();
            }


        }catch (Exception e)
        {
            System.out.println("ArrayIndexOutOfBound");
        }

   }

    public static void main(String[] args) {
        a[0]=0;
        a[1]=1;

        method1();
    }
}
