import java.util.*;
class FahrenheitToCelsius
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double F=sc.nextInt();
     double   C=(F-32)*5/9;
        System.out.println(String.format("%.2f",C));
    }
}