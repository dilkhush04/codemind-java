import java.util.*;
class ElementWithPair
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[1000];
        int i;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(n%2==0 && n>0)
        {
            for(i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
        else
        {
            for(i=0;i<n+1;i++)
            {
                if(i==n)
                {
                    a[n]=0;
                }
            }
            for(i=0;i<n+1;i++)
            {
               System.out.print(a[i]+" ");
            }
        }
        
    }
}