import java.util.*;
class MAxCO {
    static int getMaxLength(int arr[], int n)
    {
         
        int count = 0; //initialize count
        int result = 0; //initialize max
     
        for (int i = 0; i < n; i++)
        {
             
            // Reset count when 0 is found
            if (arr[i] == 0)
                count = 0;
            else
            {
                count++;//increase count
                result = Math.max(result, count);
            }
        }
     
        return result;
    }
     
    // Driver method
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         
        System.out.println(getMaxLength(arr, n));
    }
}