import java.util.*;
class PalidroomeNumber
{
    public static void pali(int n)
    {
        int temp=n,rev=0;
        while(n!=0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if(rev==temp)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
             pali(sc.nextInt());
             t--;
        }
    }
}