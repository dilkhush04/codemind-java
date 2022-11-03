import java.util.*;
class ProductOfArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,j,pro=1;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            pro=1;
            for(j=0;j<n;j++)
            {
                if(i==j)
                {continue;} 
                 pro=pro*a[j];
                
            }
             System.out.print(pro+" ");
        }
    }
}