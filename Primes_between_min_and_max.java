import java.util.*;
class PrimeNumber{
    static boolean prime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int min=999,max=-999,c=0,index=-1,index1=-1;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]<min)
            {
            min=arr[i];
            index=i;
            }
            if(arr[i]>max)
            {
            max=arr[i];
            index1=i;
            }
        }
        
        if(index1<index){
            int temp=index1;
            index1=index;
            index=temp;
        }
        
       
       for(int i=0;i<n;i++){
           if(i>=index && i<=index1)
           {
               if(prime(arr[i]))
               c++;
           }
       }
       
       
        System.out.println(c);
    }
}