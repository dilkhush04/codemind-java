import java.util.*;
class sumofElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=a && arr[i]<=b){
                    sum+=arr[i];
                
            }
        }
        System.out.print(sum);
        
    }
}