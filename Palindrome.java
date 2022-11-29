import java.util.*;
class Palidrome
{
    public static int close(int n)
    {
        int m=n;
        int rev=0;
        while(m!=0)
        {
            int rem=m%10;
            rev=rev*10+rem;
            m/=10;
        }
        if(n==rev)
        {
            return 1;
        }
        else
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(close(n)==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
       
    }
}