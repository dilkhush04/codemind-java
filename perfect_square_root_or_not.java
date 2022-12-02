import java.util.*;
class UglyNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        double m=Math.pow(n,0.5);
        if(m==(int)m)
        System.out.println("True");
        else
        {
            System.out.println("False");
        }
       
    }
}