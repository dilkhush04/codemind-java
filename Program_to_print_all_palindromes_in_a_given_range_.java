import java.util.*;
class Allpalidrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
          int n=sc.nextInt();
          int i;
          int temp;
          int rev=0;
          int rem;
        for(i=m;i<n;i++)
        {
                temp=i;
                while(temp!=0)
                {
                    rem=temp%10;
                    rev=rev*10+rem;
                    temp=temp/10;
                }
                if(rev==i)
                {
                    System.out.print(i+" ");
                }
                rev=0;
            
            
        }
    }
}