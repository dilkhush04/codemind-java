import java.util.*;
class HelpJarvis
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
        String str=sc.next();
        int n=str.length();
        int[] a=new int[100];
        int min=999,max=-999;
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            int temp=(int)ch;
            a[i]=temp;
            if(temp>max)
            max=temp;
            if(temp<min)
            min=temp;
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        int[] b=new int[100];
        int k=0;
        for(int i=min;i<=max;i++)
        {
            b[k++]=i;
        }
        for(int i=0;i<k;i++)
        {
            for(int j=i+1;j<k;j++)
            {
                if(b[i]>b[j])
                {
                    int temp=b[i];
                    b[i]=b[j];
                    b[j]=temp;
                }
            }
        }
        int flag=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=b[i])
            {
               
               flag=1;
            }
        }
        if(flag==0)
        System.out.println("YES");
        else
        System.out.println("NO");
    }    
    }
}