import java.util.*;
class ReverseNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int c=0;
        while(n!=0)
        {
             c=c*10+n%10;
             n/=10;
        }
        
        System.out.println(c);
        
       
    }
}