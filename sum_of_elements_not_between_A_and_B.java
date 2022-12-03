import java.util.*;
class SumofElement
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i;
        int c=0;
        int j;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        int num1=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]>=num && a[i]<=num1)
            {
                int k=1;
            }
            else
            {
                c+=a[i];
            }
        }
        System.out.println(c);
    }
    
}