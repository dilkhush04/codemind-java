import java.util.*;
class ClosePalidrome
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
        int sum=0;
        int min=-99,max=-99;
        for(int i=1;i<n*n;i++)
        {
            if(i==n)
            continue;
            if(close(i)==1)
            {
                if(i<=n)
                {
                    min=i;
                }
                if(i>=n)
                {
                    max=i;
                    break;
                }
            }
            
        }
        if(n-min==max-n)
        {
            System.out.println(min+" "+max);
        }
        else
        if(n-min<max-n)
        {
            System.out.println(min);
        }
        else
        {
            System.out.println(max);
        }
       
    }
}