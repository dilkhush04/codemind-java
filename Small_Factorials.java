import java.util.*;
class SmallFactorials
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int i=0;i<T;i++)
        {
          int  p=1;
            int r=sc.nextInt();
            for(int j=1;j<=r;j++)
            {
                p=p*j;
            }
            System.out.println(p);
        }
       
    }
}