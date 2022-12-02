import java.util.*;
class Dist
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int c=0,i,j,sum;
        for(i=n;i<=m;i++)
        {
            sum=0;
            for(j=i;j<=m;j++)
            {
                sum=sum+j;
                if(sum%2!=0)
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}