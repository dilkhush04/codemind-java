import java.util.*;
 class AverageOfPrimes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,t,c,flag,k=0;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        for(i=0;i<n;i++){
            t=a[i];
   	     if(t<=1)
     	{
   		continue;
	   }
      flag=0;
      for(j=2;j<=t/2;++j){ 
         if(t%j==0){
            flag=1;
            break;
         }
      }
      
      if(t<=num)
      {
          if(flag==0)
          {
              k++;
          }
      }
        
   }
       
       System.out.println(k);
    }
}
