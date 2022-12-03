import java.util.*;
class NearestPrime{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
         
    
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
        int test=max-min;
        if((max-n)>(n-min))
        {
            System.out.println(min);
        }
        else
        if((n-min)==(max-n))
        {
            System.out.println(min);
        }
        else
        {
            System.out.println(max);
        }
        
           t--;
        }
        
    }
    
}