import java.util.*;
class Mininm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=-999;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(temp<a[i])
            {
                temp=a[i];
            }
        }
        int tar=sc.nextInt();
         for(int i=0;i<n;i++)
        {
            if(a[i]+tar>=temp)
            {
                 System.out.print("True ");
             }
             else
            {
                 System.out.print("False ");
             }
        }
        
        
    }
}