import java.util.*;
class AdanNumber
{
   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int rev=0,rev1=0;
        while(n!=0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        int sq1=rev*rev;
        while(sq1!=0)
        {
            int rem1=sq1%10;
            rev1=rev1*10+rem1;
            sq1/=10;
        }
        if(sq==rev1)
        {
            System.out.println("True");
        }
        else
        {
             System.out.println("False");
        }
         
        
        
    }
        
       
    }