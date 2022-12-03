import java.util.*;
class SmallerThenAve
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int i,flag=0;
        int c=0;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]==0 || a[i]==1)
            {
                continue;
            }
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        System.out.println("True");
        else
        System.out.println("False");
    }
}