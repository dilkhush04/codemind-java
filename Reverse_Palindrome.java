import java.util.*;
class ReversePalidrome
{
    public static int reverse(int n)
    {
        int temp=n;
        int rev=0;
        while(temp!=0)
        {
          int  rem=temp%10;
             rev=rev*10+rem;
            temp=temp/10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    n=n+reverse(n);
    while(1>0)
    {
        if(n==reverse(n))
        {
            System.out.println(n);
            break;
        }
        else
        {
            n=n+reverse(n);
        }
    }
    }
}