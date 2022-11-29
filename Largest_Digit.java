import java.util.*;
class UglyNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long  n=sc.nextLong();
        long temp=-999;
        int c=0;
        while(n!=0)
        {
           long rem=n%10;
           if(temp<rem)
           {
               temp=rem;
           }
            n=n/10;
            
        }
        
            System.out.println(temp);
        
       
    }
}