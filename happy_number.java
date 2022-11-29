import java.util.*;
class happyNumber
{
    public static int happy(int n)
    {
        int num=n,sum=0;
        while(num!=0)
        {
            int rem=num%10;
            sum=sum+rem*rem;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(1>0)
          { if(happy(n)<10)
           {
               if(happy(n)==1 || happy(n)==7)
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
