import java.util.*;
 
class GFG {
    public static void findFirstAndLast(int arr[], int x, int n)
    {
      
        int first = -1, last = -1;
        for (int i = 0; i < n; i++) {
            if (x != arr[i])
                continue;
            if (first == -1)
                first = i;
            last = i;
        }
        if (first != -1) {
            System.out.println(first+" "+last);
            
        }
        else
            System.out.println("-1 -1");
    }
 
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        int[] arr=new int[n];
        for(int k=0;k<n;k++)
        {
            arr[k]=sc.nextInt();
        }
        int x =sc.nextInt();
        findFirstAndLast(arr, x ,n);
    }
}