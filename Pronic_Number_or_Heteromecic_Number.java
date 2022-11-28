import java.util.*;
class Pronic
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=-999;
        int flag=0;
        for(int i=0;i<n;i++)
        {
           
          if(i*(i+1)==n)
          {
              flag=1;
              break;
          }
           
        }
        
            if(flag==0)
            {
                 System.out.print("NO");
             }
             else
             {
                 System.out.print("YES");
             }
        
        
        
    }
}