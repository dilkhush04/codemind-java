import java.util.*;
class ThirdLargestNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,temp,k;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
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
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        if(n>=3)
        {
            System.out.println(a[n-3]);
        }
        else
        {
            System.out.println("It is not possible");
        }
        
    }
}