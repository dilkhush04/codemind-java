import java.util.*;
class SumofElement
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,temp=-999;
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
                if(temp<a[i])
                {
                    temp=a[i];
                    c=1;
                }
            }
        }
        if(c==0)
        System.out.println("-1");
        else
        System.out.println(temp);
    }
    
}