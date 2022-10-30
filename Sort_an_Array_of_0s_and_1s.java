import java.util.*;
class SortAnArrayOF0Sand1s
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,j,c=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]==1)
            {
                c++;
            }
            
        }
        if(c==n || c==0)
        {
            for(i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
        else
        {
            for(i=0;i<n;i++)
            {
                for(j=i+1;j<n;j++)
                {
                    if(a[i]>a[j])
                    {
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
             for(i=0;i<n;i++)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}