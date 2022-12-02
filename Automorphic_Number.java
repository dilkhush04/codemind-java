import java.util.*;
class AutomorphicNumber
{
    public static int num(int n)
    {
        int rev=0;
        while(n!=0)
        {
            rev++;
            n/=10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n*n;
        if(n==m%Math.pow(10,num(n)))
        {
            System.out.println("Automorphic Number");
            
        }
        else
        {
            System.out.println("Not an Automorphic Number");
        }
       
        
    }
}
