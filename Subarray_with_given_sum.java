import java.util.*;
class SubarrayWithGibnenSum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        int[] b=new int[T];
        int i,j,k;
        int[] c=new int[T];
        for(k=0;k<T;k++)
        {
            int max=-1,min=-1;
            int n=sc.nextInt();
            int s=sc.nextInt();
            int[] a=new int[n];
            for(i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(i=0;i<n;i++)
            {
                int flag=0;
                int sum=0;
                for(j=i;j<n;j++)
                {
                    sum=sum+a[j];
                    if(sum==s)
                    {
                        min=i+1;
                        max=j+1;
                        flag=1;
                        break;
                    }
                }
                if(flag==1)
                {
                    break;
                }
            }
            b[k]=min;
            c[k]=max;
        }
        for(i=0;i<T;i++)
        {
            if(b[i]==-1 && c[i]==-1)
            System.out.println("-1");
            else
            System.out.println(b[i]+" "+c[i]);
        }
    }
}