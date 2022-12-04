import java.util.*;
class UniqueEvencount
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int[] a=new int[n];
        int[] b=new int[n];
        int i,j,k,c=0;
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
                       a[k]=a[k+1] ;
                    }
                    n--;
                    j--;
                }
                
            }
        }
        for(i=0;i<n;i++)
        {
           
                if(a[i]%2==0)
                {
                    c++;
                }
          
            
        }
        System.out.println(c);
    }
}