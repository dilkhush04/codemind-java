import java.util.*;
class CountPalidrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int i;
        int rev=0;
        int[] a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            int tem=a[i];
            int num=a[i];
            while(num!=0)
            {
                int rem=num%10;
                 rev=rev*10+rem;
                num=num/10;
            }
            if(tem==rev)
            {
                c++;
            }
            rev=0;
        }
        System.out.println(c);
    }
}