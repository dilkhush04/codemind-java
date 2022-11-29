import java.util.*;
class DisariumNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n,c=0,sum=0;
        while(m!=0)
        {
            c++;
            m/=10;
        }
        m=n;
        while(m!=0)
        {
            int rem=m%10;
            double num=Math.pow(rem,c--);
            sum+=num;
            m/=10;
        }
        if(sum==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
       
    }
}