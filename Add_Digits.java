import java.util.*;
class Add
{
    public static int add(int n)
    {
        int sum=0;
        while(n!=0)
        {
             sum+=n%10;
            n=n/10;
        }
        return sum;
    }
    public static void main(String[] args)
    {    
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(1>0)
        {
            n=add(n);
            if(n<10)
            {
            System.out.println(n);
            break;
            }
        }
      //  System.out.println(n);
    
}   }