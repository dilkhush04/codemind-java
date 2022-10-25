import java.util.*;
class CosttfenceTheParkOUtside
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        int w=sc.nextInt();
        int c=sc.nextInt();
        int A;
        int cost;
        A=(l+w+w)*(b+w+w)-l*b;
        cost=A*c;
        System.out.println(cost);
    }
}