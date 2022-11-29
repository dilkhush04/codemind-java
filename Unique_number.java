import java.util.*;
class AmicableNumber
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=0;
        int[] a=new int[100];
        while(n!=0)
        {
            int rem=n%10;
            a[i++]=rem;
            n=n/10;
        }
        int flag=0;
        for(int k=0;k<i;k++)
        {
            //System.out.println(a[k]);
            for(int j=k+1;j<i;j++)
            {
                if(a[k]==a[j])
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        {
            System.out.println("Unique Number");
        }
        else
        {
            System.out.println("Not Unique Number");
        }
    }
}