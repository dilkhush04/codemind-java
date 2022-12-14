import java.util.*;
class WaveCount
{
    static int wave(int a[],int n)
    {
        for(int i=1;i<n-1;i++)
        {
            if((a[i]>a[i-1] && a[i+1]<a[i]) || (a[i]<a[i-1] && a[i + 1]>a[i]))
            {
                continue;
            }
            else
            return 0;
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int count=(n-1)/2;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(wave(a,n)==1)
        {
            System.out.print(count);
        }
        else
        {
            System.out.print("-1");
        }
    }
}