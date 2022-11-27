import java.util.*;
class AngleBetweenHand
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String a[]=str.split(":");
        int h=Integer.parseInt(a[0]);
        int m=Integer.parseInt(a[1]);
        double ans=Math.abs(30*h-5.5*m);
        if(ans<360-ans)
        {
            if(ans>(int)ans)
            {
                System.out.printf("%.1f",ans);
            }
            else
            {
                System.out.printf("%.1f",ans);
            }
        }
        else
        {
            if(360-ans>(int)(360-ans))
            {
                System.out.printf("%.1f",360-ans);
            }
            else
            {
                 System.out.printf("%.1f",360-ans);
            }
        }
         sc.close();
    }
}