import java.util.*;
 class Replace
 {
    public void replace(int[] arr, int n) {
        int[] res = new int[n];
        res[n - 1] = -1;
        int max = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            res[i] = max;
            max = Math.max(max, arr[i]);
        }
       for(int i=0;i<n;i++)
       {
           System.out.print(res[i]+" ");
       }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Replace obj=new Replace();
        obj.replace(arr,n);
        
    }
}