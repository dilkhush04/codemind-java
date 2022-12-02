import java.util.*;
class UniqueNUmber
{
     void uniqe(int n)
    {
        int[] a=new int[100];
        int c=0;
        int i,j;
        while(n!=0)
        {
            a[c++]=n%10;
            n/=10;
        }
        int flag=0;
        for(i=0;i<c;i++)
        {
            for(j=i+1;j<c;j++)
            {
                if(a[i]==a[j])
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
        
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        UniqueNUmber obj=new UniqueNUmber();
        obj.uniqe(n);
    }
}
