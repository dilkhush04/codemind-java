import java.util.*;
class Generate{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        
        ArrayList<Integer> a=new ArrayList<Integer>();
        
        
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        
        for(int i=0;i<n;i=i+2){
            for(int j=0;j<arr[i+1];j++)
            {
                a.add(arr[i]);
            }
        }
        for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
            
    }
}