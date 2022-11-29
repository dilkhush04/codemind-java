import java.util.*;
class Tables
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i=1;
        while(i<=m)
        {
            System.out.println(n+" x "+i+" = "+n*i);
            i=i+2;
        }
        
    }
}