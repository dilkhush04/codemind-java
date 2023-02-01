import java.util.*;
class Target_Array{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int[] a=new int[m];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        
        
        int n=sc.nextInt();
        int[] b=new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        
        ArrayList<Integer> arr=new ArrayList<Integer>();
        
        for(int i=0;i<n;i++){
            arr.add(b[i],a[i]);
        }
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
    }
}