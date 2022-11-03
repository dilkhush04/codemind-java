import java.util.*;
class HalfList
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k,temp;
        int[] a=new int[n];
        int[] d=new int[n];
        int[] b=new int[n/2];
        int[] c=new int[n/2];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
     
        for(i=0;i<n/2;i++)
        {
            c[i]=a[n-i-1];
            b[i]=a[i];
            
            
        }
    
    for(i=0;i<n;i++)
    {
        if(i<n/2)
        {
            d[i]=c[i];
        }
        if(i>=n/2)
        {
            
            d[i]=b[i-n/2];
        }
    }
    for(i=0;i<n;i++)
    {
        System.out.print(d[i]+" ");
    }
    
    }
}