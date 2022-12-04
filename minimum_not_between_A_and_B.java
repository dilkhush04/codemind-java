import java.util.*;
class MinimumNotBwAandB{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        int temp=9999;
        for(int i=0;i<n;i++){
            if(arr[i]>=a && arr[i]<=b){
                int k=0;
            }
            else
            {
                if(temp>=arr[i])
                {
                    temp=arr[i];
                }
            }
        }
        if(temp==9999)
            System.out.print("-1");
        else
            System.out.print(temp);
        
    }
}