import java.util.*;
class Battle{
    static int Battle(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        return 1;
        else
        return 0;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int day1=sc.nextInt();
        int day2=sc.nextInt();
        int day3=99;
        for(int i=1;i<day3;i++)
        {
            if(Battle(day1+day2+i)==1)
            {
                System.out.print(i);
                break;
            }
        }
    }
}