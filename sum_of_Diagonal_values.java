import java.util.*;
class Diagonal_sum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum1=0;
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
            }
            
        }
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==j)
                sum1+=a[i][j];
               
              
            }
            
            
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==r/2 && j==c/2)
                continue;
                
                if(i+j==r-1)
                sum1+=a[i][j];
              
            }
            
            
        }
        
        System.out.print(sum1);
    }
}