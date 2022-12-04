import java.util.*;
class sumbetween{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,sum1=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n/2;i++){
            sum+=arr[i];
            
        }
        for(int i=n/2;i<n;i++){
            sum1+=arr[i];
            
        }
        System.out.println(sum);
        System.out.println(sum1);
        
    }
}