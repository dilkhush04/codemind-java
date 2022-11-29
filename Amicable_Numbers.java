import java.util.*;
class AmicableNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i,s1=0,s=0;
        for(i=1;i<n/2+1;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
         for(i=1;i<m/2+1;i++)
        {
            if(m%i==0)
            {
                s1=s1+i;
            }
        }
        if(s1==n && s==m)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
    }
}