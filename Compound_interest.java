import java.util.*;
class CompoundInterest
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextInt();
        double r=sc.nextInt();
        double t=sc.nextInt();
        System.out. printf("%.2f",p*Math.pow((1+0.01*r),t));
    }
}