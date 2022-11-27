import java.util.*;
class SelfDividingnumber
{
    public static int self(int n)
    {
        int temp=n;
        int c=0,k=0;
        while(temp!=0)
        {
            
            int rem=temp%10;
            k++;
            if(rem==0)
            break;
            if(n%rem==0)
            {
                c++;
            }
            temp=temp/10;
        }
        if(c==k)
        {
            return n;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
           int  n=i;
            if(self(n)==n)
            {
                System.out.print(i+" ");
            }
        }
    }
}