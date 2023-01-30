import java.util.*;
class Merge_W_E_Space{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
             ArrayList<Integer> arr=new ArrayList<Integer>();
            
            for(int i=0;i<n+m;i++)
            {
                arr.add(sc.nextInt());
            }
             Collections.sort(arr);
            for(int i=0;i<m+n;i++)
            {
                if(i!=m+n-1)
                {
                    System.out.print(arr.get(i)+" ");
                }
                else
                {
                    System.out.print(arr.get(i));
                }
            }
            System.out.println();
        }
    }
}