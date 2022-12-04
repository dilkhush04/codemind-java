import java.util.*;
class SumOfArrayUptofirst_even{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                break;
            }
            sum+=arr[i];
        }
        System.out.print(sum);
        
    }
}