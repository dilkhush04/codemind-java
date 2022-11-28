import java.util.*;
class SpyNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,p=1;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+rem;
            p=p*rem;
            n/=10;
        }
        if(sum==p)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}