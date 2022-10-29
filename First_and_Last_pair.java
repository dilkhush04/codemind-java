import java.util.*;
class FirstLastPair
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(n%2==0)
        {
            for(i=0;i<n/2;i++)
            {
                System.out.print(a[i]+" "+a[n-1-i]+" ");
            }
        }
        else
        {
             for(i=0;i<n/2;i++)
            {
                System.out.print(a[i]+" "+a[n-1-i]+" ");
            }
            i=n/2;
            System.out.print(a[i]+" "+"0");
        }
    }
}