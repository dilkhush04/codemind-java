import java.util.*;
class Maximum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        int count=0;
        int temp=-9999;
        for(int i=0;i<n;i++){
            if(arr[i]>=a && arr[i]<=b){
                if(arr[i]>=temp){
                    temp=arr[i];
                }
            }
        }
        if(temp==-9999)
            System.out.print("-1");
        else
            System.out.print(temp);
        
    }
}