import java.util.*;
class Student_HW
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] star=new int[n];
        for(int i=0;i<n;i++)
        {
            star[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] end=new int[m];
        for(int i=0;i<m;i++)
        {
            end[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if( k>=star[i] && k<=end[i])
            {
                c++;
            }
        }
        System.out.println(c);
    }
}