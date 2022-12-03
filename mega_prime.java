import java.util.*;
class  MegaPrime
{
    static int mega(int n)
    {
        if(n==1)
        return 0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int flag=0;
        if(mega(n)==1)
        {
            flag=1;
            while(n!=0)
            {
                if(mega(n%10)==0)
                {
                    System.out.println("Not Mega Prime");
                    flag=2;
                    break;
                }
                n=n/10;
            }
            if(flag==1)
             System.out.println("Mega Prime");
        }
        if(flag==0)
         System.out.println("Not Mega Prime");
        
    }
}