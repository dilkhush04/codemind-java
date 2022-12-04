import java.util.*;
class CCommonElements
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[] arr1=new int[a];
        int[] arr2=new int[b];
        int[] arr3=new int[b+a];
        int i,j,k,p=0,c=0,flag;
        for(i=0;i<a;i++)
        {
           arr1[i]=sc.nextInt(); 
        }
         for(i=0;i<b;i++)
        {
           arr2[i]=sc.nextInt(); 
        }
        for(i=0;i<a;i++)
        {
            for(j=i+1;j<a;j++)
            {
                if(arr1[i]==arr1[j])
                {
                    for(k=j;k<a-1;k++)
                    {
                        arr1[k]=arr1[k+1];
                    }
                    j--;
                    a--;
                }
                
            }
        }
         for(i=0;i<b;i++)
        {
            for(j=i+1;j<b;j++)
            {
                if(arr2[i]==arr2[j])
                {
                    for(k=j;k<b-1;k++)
                    {
                        arr2[k]=arr2[k+1];
                    }
                    j--;
                    b--;
                }
                
            }
        }
        for(i=0;i<a;i++)
        {
             flag=0;
             for(j=0;j<b;j++)
             {
                  if(arr1[i]==arr2[j])
                  {
                       flag=1;
                  }
             }
             if(flag==1)
             {
                  arr3[p++]=arr1[i];
             }
        }
        
        for(i=0;i<p;i++)
        {
            System.out.print(arr3[i]+" ");
        }
        
    }
}