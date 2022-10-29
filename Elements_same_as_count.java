import java.util.*;
class ElementAndCoun
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int i,j,k,c,sum=0,p=0;
        int[] a=new int[n];
       int[] b=new int[num];
       for(i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
           b[i]=a[i];
       }
       for(i=0;i<n;i++)
       {
           for(j=i+1;j<n;j++)
           {
               if(a[i]==a[j])
               {
                   for(k=j;k<n-1;k++)
                   {
                       a[k]=a[k+1];
                   }
                   j--;
                   n--;
               }
           }
       }
       for(i=0;i<n;i++)
       {
           c=0;
           for(j=0;j<num;j++)
           {
               if(a[i]==b[j])
               {
                   c++;
               }
           }
           if(a[i]==c)
           {
               p++;
               System.out.print(a[i]+" ");
             
           }
           
       }
       if(p==0)
       {
            System.out.println("-1");
       }
       
       
    }
}