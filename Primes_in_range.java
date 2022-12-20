import java.util.*;
class Prime
{
    static boolean prime(int n)
    {
        if (n<2)
        return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0;
        for(int i=n;i<=m;i++)
        {
            if(prime(i))
            c++;
        }
        System.out.println(c);
    }
}