import java.util.*;
class CanRobberEscape
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        int c=0 ,i;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]%2==1)
            {
                c++;
            }
           
        }
       
        if(c<=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}