import java.util.*;
class EvenOddMixed
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem;
        int c=0;
        int d=0;
        while(n!=0)
        {
            rem=n%10;
            c++;
            if(rem%2==0)
            {
                d++;
            }
            n=n/10;
        }
        if(c==d)
        {
            System.out.println("Even");
        }
      else if(d==0)
        {
            System.out.println("Odd");
        }
        else
        {
            System.out.println("Mixed");
        }
    }
}