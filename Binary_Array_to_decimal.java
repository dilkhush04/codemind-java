import java.util.*;
class SmallerThenAve
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,j=0;
        double sum=0;
        
        int c=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=n-1;i>=0;i--)
        {
            sum=sum+a[i]*Math.pow(2,j++);
        }
      
        System.out.println((int)sum);
    }
}