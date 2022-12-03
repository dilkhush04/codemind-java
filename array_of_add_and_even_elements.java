import java.util.*;
class EvenFollowedbyOdd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int[] c=new int[n];
        int i;
        int j=0,k=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
               b[j]=a[i]; 
               j++;
            }
            else
            {
                c[k]=a[i];
                k++;
            }
            
        }
        for(i=0;i<n;i++)
        {
            if(i<k)
            {
                a[i]=c[i];
            }
        }
        for(i=0;i<n;i++)
        {
            if(i<j)
            {
                a[i+k]=b[i];
            }
        }
        for(i=0;i<n;i++)
        {
           System.out.print(a[i]+" ");
        }
    
    }
    
}