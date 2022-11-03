import java.util.*;
class MostFrequent
{
    public static void main(String[] args)
      {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int m=n;
          int i,j,k,max=999,temp=-9999;
          int[] a=new int[n];
          int[] b=new int[100];
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
            int c=0;
              for(j=0;j<m;j++)
              {
                  if(a[i]==b[j])
                  {
                     c++; 
                  }
              }
              if(temp<c)
              {
                  temp=c;
                  max=a[i];
              }
              if(temp==c)
              {
                  if(a[i]<max)
                  {
                      max=a[i];
                  }
              }
          }
          System.out.println(max);
      }
}