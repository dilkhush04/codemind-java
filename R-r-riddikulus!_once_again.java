import java.util.*;
class OnceAgain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int r=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=r;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
         for(i=0;i<r;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}