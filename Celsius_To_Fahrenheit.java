import java.util.*;
class CelsiusToFahrenheit
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextInt();
     double   F=n*9/5+32;
        System.out.println(String.format("%.2f",F));
    }
}