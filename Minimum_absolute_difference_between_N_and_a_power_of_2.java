import java.util.*;
class Mininm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0,min=-999,max=-999;
        while(1>0)
        {
            double num=Math.pow(2,i++);
            if(num<=n)
            {
                min=(int)num;
            }
            if(num>=n)
            {
                max=(int)num;
                break;
            }
        }
        if(n-min>max-n)
        {
            System.out.println(max-n);
        }
        else
        if(n-min==max-n)
        {
            System.out.println(max-n);
        }
        else
        {
            System.out.println(n-min);
        }
    }
}