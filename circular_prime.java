import java.util.*;
class Pronic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=-999;
        int flag=0;
        for(int i=2;i<=n/2;i++)
        {
           
          if(n%i==0)
          {
              flag=1;
              break;
          }
           
        }
            if(flag==1)
            {
                 System.out.print("not prime");
             }
             else
             {
                 int rev=0;
                 temp=n;
                 int c=0;
                 while(n!=0)
                 {
                     int rem=n%10;
                     rev=rev*10+rem;
                     n/=10;
                 }
                 for(int j=2;j<=rev/2;j++)
                 {
                     if(rev%j==0)
                     {
                         c=1;
                         break;
                     }
                 }
                 if(c==0)
                 {
                     System.out.print("circular prime");
                 }
                 else
                 {
                     System.out.print("prime but not a circular prime");
                 }
             }
        
        
        
    }
}