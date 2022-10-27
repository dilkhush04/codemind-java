import java.util.*;
 class AverageOfPrimes
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,sum=0,t,c,flag,k=0;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
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
      if(flag==0)
      {
         
          sum=sum+t;
          k++;
      }
        
   }
        double avg=(float)sum/k;
       System.out.println(String.format("%.2f",avg));
    }
}