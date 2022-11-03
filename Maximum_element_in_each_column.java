import java.util.*;
class MaximumElementInArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int c=sc.nextInt();
        int i,j,temp;
        int r=sc.nextInt();
        int[][] a=new int[c][r];
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<r;i++)
        {
            temp=-9999;
            for(j=0;j<c;j++)
            {
                if(temp<a[j][i])
                {
                    temp=a[j][i];
                }
            }
            System.out.println(temp);
        }
    }
}