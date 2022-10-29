import java.util.*;
class SquareNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
       for(int i=1;i<n;i++)
       {
           for(int j=1;j<n;j++)
           {
               if(Math.pow((i+j),2)==n)
               {
                   k=1;
               }
           }
       }
       if(k==0)
       {
           System.out.println("False");
       }
       else
       {
           System.out.println("True");
       }
    }
}