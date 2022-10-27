import java.util.*;
class UniqueEvensum
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        int i,j,k=0,c=0,sum=0,temp=99999;
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
                   c++;
                }
                
            }
         
            if((c+1)==a[i])
            {
                b[k]=a[i];
                k++;
                
            }
            c=0;
        }
        
        if(k==0)
        {
            System.out.print(-1);
        }
        else
        {
            System.out.print(b[0]+" "+b[k-1]);
        }
       
    }
}