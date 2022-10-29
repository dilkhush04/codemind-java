import java.util.*;
class FibonacciSequence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int b=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
            System.out.print(c+" ");
             c=a+b;
            a=b;
            b=c;
        }
    }
}
