import java.util.*;
class NearestPrime{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=-99,min=-99;
        int a=1,b=0,c=0;
        while(1>0)
        {
            if(c<=n)
            {
                min=c;
            }
            if(c>=n)
            {
                max=c;
                break;
            }
            c=a+b;
            a=b;
            b=c;
        }
        if(n-min>max-n)
        {
            System.out.println(max);
        }
        else
        if(n-min==max-n)
        {
            System.out.println(min+" "+max);
        }
        else
        {
            System.out.println(min);
        }
    }
    
}