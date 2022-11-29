import java.util.*;
class Gcd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0,i,j;
        int[] a=new int[100];
       for(i=2;i<=n;i++)
       {
           int flag=0;
           for(j=2;j<=i/2;j++)
           {
               if(i%j==0)
               {
                   flag=1;
                   break;
               }
           }
           if(flag==0)
           {
               a[k++]=i;
           }
       }
       int flag=0;
       for(i=0;i<k;i++)
       {
           for(j=i+1;j<n;j++)
           {
               if(i*j==n)
               {
                   flag=1;
                   System.out.println(i+" "+j);
                   break;
               }
           }
       }
       if(flag==0)
       {
           System.out.println("-1");
       }
        
    }
}