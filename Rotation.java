import java.util.*;
class Rotation{
    static void check(int[] a, int n, int r){
        for(int k=0;k<r;k++){
            int last=a[n-1];
            for(int i=n-1;i>0;i--){
                a[i]=a[i-1];
            }
            a[0]=last;
        }
        for(int i=0;i<n;i++){
            if(i==n-1){
                System.out.print(a[i]);
            }
            else
            {
                 System.out.print(a[i]+" ");
            }
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int r=sc.nextInt();
            int[] a=new int[n];
            
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
                
            }
            check(a, n, r);
        }
    }
   
}