import java.util.*;
class UglyNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int c=0;
        double num=Math.pow(n,0.5);
        if((int)num*(int)num==n)
        System.out.println("True");
        else
        {
            System.out.println("False");
        }
       
    }
}