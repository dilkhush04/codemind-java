import java.util.*;
class MinimumScaleLength
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=999;
        int[] a=new int[n];
        int i,j;
        for( i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(min>a[i])
            {
                min=a[i];
            }
        }
        for(i=min;i>=1;i--)
        {
            int found=0;
            for(j=0;j<n;j++)
            {
                if(a[j]%i!=0)
                {
                    found=1;
                    break;
                }
            }
            if(found==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}