import java.util.*;
class CompoundI
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double p=sc.nextDouble();
        double r=sc.nextDouble();
        double t=sc.nextDouble();
        System.out.printf("%.2f",Math.pow((1+0.01*r),t)*p);
    }
}