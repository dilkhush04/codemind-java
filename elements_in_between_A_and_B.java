import java.util.*;
class ElementsBetweenAandB
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,c=0;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]>=x && a[i]<=y)
            {
                System.out.print(a[i]+" ");
                c++;
            }
        }
        if(c==0)
        {
           System.out.print("-1"); 
        }
    }
}