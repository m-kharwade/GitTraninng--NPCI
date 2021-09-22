public class JavaProblem8 {

    public static void main(String[] args) {
        int [][] a={{1,2,3},{3,-2,5}};
        int [][] b={{4,3,0},{7,5,1}};

        int rows=2;
        int col=3;
        int [][] sum=new int[rows][col];

        for(int i=0;i<rows;i++)
        {
            for (int j=0;j<col;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }


    }

}
