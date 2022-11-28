import java.util.*;
class NearestPrime{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int test,test1;
        int max=-99,min=-99;
        for(int i=2;i<Math.pow(n,2);i++)
        {
            int flag=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    flag=1;
                }
            }
            if(flag==0)
            {
                if(i<=n)
                {
                    min=i;
                }
                if(i>=n)
                {
                    max=i;
                    break;
                }
            }
            
        }
        
         test=n-min;
         test1=max-n;
        if(test>test1)
        {
            System.out.println(test1);
        }
        else
        if(test==test1)
        {
            System.out.println(test);
        }
        else
        {
            System.out.println(test);
        }
    }
    
}