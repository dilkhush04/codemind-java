import java.util.*;
class WaveArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,flag=0,k=0;
        double sum=0;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
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
                    sum+=a[i];
                    k++;
                }
            
        }
        }
        System.out.printf("%.2f",sum/k);
       
    }
}