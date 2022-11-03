import java.util.*;
class MonkAndWelcomeProblem
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int[] a=new int[n];
         int[] b=new int[n];
         for(i=0;i<n;i++)
         {
             a[i]=sc.nextInt();
         }
          for(i=0;i<n;i++)
         {
             b[i]=sc.nextInt();
         }
          for(i=0;i<n;i++)
         {
             System.out.print((a[i]+b[i])+" ");
         }
    }
}