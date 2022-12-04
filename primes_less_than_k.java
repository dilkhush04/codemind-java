import java.util.*;
class PrimesLessThan_k
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,flag=0;
        int c=0;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();
            
        for(i=0;i<n;i++)
        {
            
           flag=0;
            if(a[i]>1){
            for( j=2;j<=a[i]/2;j++)
            {
                if(a[i]%j==0)
                {
                    flag=1;
                    break;
                    
                }
                
            }
            if(flag==0)
                {
                    if(a[i]<=k)
                    {
                        c++;
                    }
                }
            
        }
        }
        System.out.print(c);
       
    }
}