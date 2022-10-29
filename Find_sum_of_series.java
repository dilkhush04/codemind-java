import java.util.*;
class SumOfSeries
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++)
        {
            double k=(float)1/i;
             sum=(float)(sum+k);
        }
        System.out.println(String.format("%.2f",sum));
    }
    
}