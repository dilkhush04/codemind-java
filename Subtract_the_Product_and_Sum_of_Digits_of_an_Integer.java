import java.util.*;
class SelfDividingnumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=1,s=0;
        while(n!=0)
        {
            int r=n%10;
            p=p*r;
            s=s+r;
            n=n/10;
        }
        System.out.println(p-s);
    }
}