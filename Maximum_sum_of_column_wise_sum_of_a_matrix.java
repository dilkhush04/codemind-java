

import java.util.*;
class SumOf_all_element
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum1=0,temp=-999;
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
        
        for(int i=0;i<c;i++)
        {
            sum1=0;
            for(int j=0;j<r;j++)
            {
    
               sum1+=a[j][i];
              
            }
            if(temp<sum1)
            {
                temp=sum1;
            }
            
        }
        System.out.println(temp);
    }
}