public class JavaProblem9 {
    public static void main(String[] args) {

        //identical matrix
       /* int [][] a={{1,2,2},{3,-2,5}};
        int [][] b={{1,2,2},{3,-2,5}};*/

        //non identical matrix input
        int [][] a={{1,12,5},{3,-2,6}};
        int [][] b={{1,2,2},{3,-2,5}};


        int row=a.length;
        int col=a[1].length;
        int count=0;
        int [][]c=new int[row][col];

        for(int i=0;i<a.length;i++)
        {
            for (int j = 0; j < a[i].length; j++)
            {
                if(a[i][j]==b[i][j])
                {
                    c[i][j]=0;
                    count++;
                }
                else
                {
                    c[i][j]=a[i][j];
                }
            }

        }

        if (count == row * col)
            System.out.println("Identical Matrix");
        else{
            for(int i=0;i<a.length;i++) {
                for (int j = 0; j < a[i].length; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }


    }
}
