import java.util.*;
class Fibonacci
{
    static int happy(int n)
    {
        int s=0;
        while(n!=0)
        {
            int rem=n%10;
            s=s+rem*rem;
            n/=10;
        }
        return s;
    }
   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        n=happy(n);
        while(1>0)
        {
            if(n<10)
            {
                if(n==1 || n==7)
                {
                    System.out.println("True");
                    break;
                }
                else
                {
                    System.out.println("False");
                    break;
                }
            }
            else
            {
               n=happy(n);
            }
           
            
        }
        
    }
        
       
    }