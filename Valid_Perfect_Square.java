import java.util.*;
class ValidPerfectSquare
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        while(T>0)
        {
            int n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                double c=Math.pow(i,2);
                if(c==n)
                {
                    System.out.println("True");
                    break;
                }
                if(c>n)
                {
                     System.out.println("False");
                     break;
                }
               
            }
            T--;
        }
    }
}