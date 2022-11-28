import java.util.*;
class NeonNumber
{
    public static int sum(int n)
    {
       double tem=Math.pow(n,2);
       int s=0;
       while(tem!=0)
       {
           double rem=tem%10;
           s=s+(int)rem;
           tem=tem/10;
       }
       if(s==n)
       {  
           return 1;
           
       }
       else
       {
           return 0;
       }
      
       
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        if(sum(n)==1)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}