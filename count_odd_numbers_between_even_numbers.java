import java.util.*;
class Dilkhush
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i;
        int c=0;
        int j;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if((a[i]%2==0) && (a[j]%2==0))
                {
                    c=c+(j-i-1);
                    break;
                }
            }
            
        }
        System.out.println(c);
    }
    
}