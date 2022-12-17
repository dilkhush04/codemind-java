import java.util.*;
class Harshed_number
{
    public static String number(int n)
    {
        int sum=0;
        int m=n;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        if(m%sum==0)
        return "True";
        else
        return "False";
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(number(n));
    }
}