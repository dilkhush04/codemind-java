import java.util.*;
class StrongNumber
{
    public static int fact(int n)
    {
        if(n==0)
        return 1;
        else
        {
            int ans=n*fact(n-1);
            return ans;
            
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        while(n!=0)
        {
            int rem=n%10;
            sum=sum+fact(rem);
            n=n/10;
            
        }
        if(sum==temp)
        {
            System.out.println("The number "+temp+" is a strong number");
        }
        else
        {
            System.out.println("The number "+temp+" is not a strong number");
        }
    }
}