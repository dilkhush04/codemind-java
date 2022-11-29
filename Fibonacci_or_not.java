import java.util.*;
class Fibonacci
{
   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1,b=0,c=0;
        while(1>0)
        {
            if(c==n)
            {
                System.out.println("True");
                break;
            }
            if(c>n)
            {
                System.out.println("False");
                break;
            }
            c=a+b;
            a=b;
            b=c;
            
        }
        
    }
        
       
    }
