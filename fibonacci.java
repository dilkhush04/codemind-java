import java.util.*;
class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1,b=0,c=0;
       for(int i=1;i<=n;i++)
       {
          System.out.print(c+" ");
          c=a+b;
          a=b;
          b=c;
          
       }
       
    }
}