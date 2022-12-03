import java.util.*;
class GreaterThenAve
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i;
        double sum=0;
        
        int c=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
      double  s=Math.floor(sum/n);
        for(i=0;i<n;i++)
        {
            if(a[i]>=s)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}