import java.util.*;
class Maximum69
{
    public static int number(int n)
    {
        int num=0;
        while(n!=0)
        {
            num=num*10+n%10;
            n=n/10;
        }
        return num;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,temp=0,j;
        n=number(n);
        while(n!=0)
        {
            j=n%10;
            if(c==0)
            {
                if(j==6)
                {
                    j=9;
                    c=1;
                }
            }
            temp=temp*10+j;
            n=n/10;
        }
        System.out.println(temp);
    }
}