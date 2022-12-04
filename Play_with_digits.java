import java.util.*;
class PlayWithDigit
{
    public static int play(int n)
    {
        int sum=0;
        while(n!=0)
        {
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    int sum=0;
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
        sum+=play(a[i]);
    }
    System.out.print(sum);
}
}