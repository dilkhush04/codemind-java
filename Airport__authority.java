import java.util.*;
class AirportAuthority
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0 ;i <n;i++)
        {
            a[i]=sc.nextInt();
        }
        int T=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<=T)
            {
                c++;
            }
            else
            {
                c=c+2;
            }
        }
        System.out.println(c);
    }
}