import java.util.*;
class NextPrimePalidrome
{
    public static int pali(int n)
    {
        int tem=n;
        int rev=0;
        int flag=0;
        while(tem!=0)
        {
            rev=rev*10+tem%10;
            tem/=10;
        }
        if(rev==n)
        {
            flag=1;
        }
        int c=0;
        for(int j=2;j<n;j++)
        {
            if(n%j==0)
            {
                c=1;
                break;
            }
        }
        if(c==0 && flag==1)
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
        int n=sc.nextInt();
        while(true)
        {
            n=n+1;
           if(n==pali(n))
           {
               System.out.println(n);
               break;
           }
           
        }
    }
}