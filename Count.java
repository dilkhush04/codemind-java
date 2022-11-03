import java.util.*;
class SumOfperfactQuare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,j,k,sum=0,c=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==0)
            {
                c++;
            }
            else
            {
                sum++;
            }
           
        }
      
        
        System.out.println(c+" "+sum);
       
        
    }
}