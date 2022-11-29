import java.util.*;
class Gcd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int test=m>n?m:n;
        while(1>0)
        {
            if(m%test==0 && n%test==0)
            {
                System.out.println(test);
                break;
            }
            test--;
        }
    }
}