import java.util.*;
class PhoneNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        int c=0;
        long rem=99;
        while(n!=0)
        {
            c++;
            rem=n%10;
            n/=10;
        }
        if(rem!=0 && c==10)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}