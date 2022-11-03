import java.util.*;
class SumOfMatrixElement
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int r=sc.nextInt();
        int sum=0;
        int[][] a=new int[c][r];
        for(int i=0;i<c;i++)
        {
            for(int j=0;j<r;j++)
            {
                a[i][j]=sc.nextInt();
                sum=sum+a[i][j];
            }
        }
        System.out.println(sum);
    }
}