import java.util.*;
class CountTheTriplets
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int s,i,j,k;
       
        int T=sc.nextInt();
        int[] b=new int[T];
        for(s=0;s<T;s++)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int c=0;
            for(i=0;i<n;i++)
            {
                for(j=i+1;j<n;j++)
                {
                    for(k=0;k<n;k++)
                    {
                        if((a[i]+a[j])==a[k])
                        {
                            c++;
                        }
                    }
                }
            }
            b[s]=c;
        }
        for(i=0;i<T;i++)
        {
            if(b[i]==0)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println(b[i]);
            }
        }
    }
}