import java.util.*;
class ValueSameAsCount
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int[] a=new int[n];
        int[] b=new int[num];
        int i ,j,x=0,k;
        
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    for(k=j;k<n-1;k++)
                    {
                        a[k]=a[k+1];
                    }
                    j--;
                    n--;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            int c=0;
            for(j=0;j<num;j++)
            {
                if(a[i]==b[j])
                {
                   c++;
                }
            }
            if(c==a[i])
            {
                x++;
            }
        }
        System.out.println(x);
        
    }
}