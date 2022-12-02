import java.util.*;
class GCD
{
   
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int x=n<m?n:m;
        while(1>0)
        {
            if(n%x==0 && m%x==0)
            {
                System.out.println(x);
                break;
            }
            x--;
            
        }
        
    }
        
       
    }