import java.util.*;
class LargestDigit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int temp=-999;
        while(n!=0)
        {
           int rem=n%10;
           if(temp<rem)
           {
               temp=rem;
           }
           n/=10;
        }
        
        System.out.println(temp);
       
    }
}