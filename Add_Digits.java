import java.util.*;
class AddDigit
{
    public static int add(int n)
    {
        int temp=n;
        int s=0;
        while(temp!=0)
        {
           int  rem=temp%10;
                s=s+rem;
            temp=temp/10;
        }
        return s;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(1>0)
        {
            if(n<10)
            {
                System.out.println(n);
                break;
                
            }
            else
            {
                n=add(n);
            }
        }
    }
}