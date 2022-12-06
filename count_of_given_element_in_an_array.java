import java.util.*;
class Array
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int key =sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]==key)
            {
                c++;
            }
        }
        System.out.print(c);
    }
}