import java.util.*;
class UglyNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int c=0;
        while(n!=1)
        {
            if(n%2==0)
            {
                n=n/2;
            }
            else
             if(n%3==0)
            {
                n=n/3;
            }
            else
             if(n%5==0)
            {
                n=n/5;
            }
            else
            {
                c=1;
                break;
            }
            
            
        }
        if(c==0)
        System.out.println("Ugly Number");
        else
        {
            System.out.println("Not Ugly Number");
        }
       
    }
}