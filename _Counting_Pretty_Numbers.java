import java.util.*;
 class PrettyNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int rem, temp,num;
        int[] d=new int[100];
        int k=0;
        for(int i=0;i<n;i++)
        {
          int  a=sc.nextInt();
           int  b=sc.nextInt();
            for( int j=a;j<=b;j++)
            {
                temp=j;
                
                    rem=temp%10;
                    if(rem==2 || rem==3 || rem==9)
                    {
                        c++;
                    }
            }
            d[k]=c;
            k++;
            c=0;
        }
        for(int i=0;i<k;i++)
        {
            System.out.println(d[i]);
        }
    }
}