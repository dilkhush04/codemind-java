import java.util.*;
class SearchRSA
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int T=sc.nextInt();
        int flag=0;
         for(int i=0;i<n;i++)
        {
            if(a[i]==T)
            {
                 flag=1;
                System.out.println(i);
            }
        }
        if(flag==0)
        {
            System.out.println("-1");
        }
    }
}