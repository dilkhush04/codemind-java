import java.util.*;
class RainDrop
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%3==0 && n%5==0 && n%7==0)
        {
            System.out.println("PlingPlangPlong");
        }
        else
         if(n%3==0 && n%5!=0 && n%7==0)
        {
            System.out.println("PlingPlong");
        }
        else
         if(n%3==0 && n%5==0 && n%7!=0)
        {
            System.out.println("PlingPlang");
        }
        else
         if(n%3!=0 && n%5==0 && n%7==0)
        {
            System.out.println("PlangPlong");
        }
        else
         if(n%3==0 && n%5!=0 && n%7!=0)
        {
            System.out.println("Pling");
        }
        else
         if(n%3!=0 && n%5==0 && n%7!=0)
        {
            System.out.println("Plang");
        }
        else
         if(n%3!=0 && n%5!=0 && n%7==0)
        {
            System.out.println("Plong");
        }
        else
        {
             System.out.println(n);
        }
        
    }
}