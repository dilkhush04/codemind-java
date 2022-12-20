import java.util.*;
class Almost_prime
{
     static int prime(int n)
     {
         if(n<2)
         return 0;
         for(int i=2;i<=Math.sqrt(n);i++)
         {
             if (n%i==0)
             return 0;
         }
         return n;
     }
     public static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         int T=sc.nextInt();
         while(T-->0)
         {
             int flag=0;
             int n=sc.nextInt();
             for(int i=1;i<=n;i++)
             {
                 for(int j=0;j<=n;j++)
                 {
                     
                     if(prime(i)*prime(j)==n && i!=j)
                     {
                         flag=1;
                         break;
                     }
                 }
                 if(flag==1)
                 break;
             }
             if(flag==0)
             System.out.println("NO");
             else
              System.out.println("YES");
         }
     }
}