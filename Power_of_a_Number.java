import java.util.*;
class SmallFactorials
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int m=sc.nextInt();
        double s=Math.pow(x,y)%m;
        System.out.println(String.format("%.0f",s));
        
       
    }
}