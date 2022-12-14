import java.util.*;
class WaveFormat
{
    void swap(int arr[], int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    void method(int arr[], int n)
    {
        for (int i=0; i<n-1; i += 2)
            swap(arr, i, i+1);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] arr2=new int[n];
        for(int i=0;i<n;i++)
        {
            arr2[i]=sc.nextInt();
        }
        Arrays.sort(arr2);
        for(int i=0;i<n;i++)
        {
            arr[n-i-1]=arr2[i];
        }
        WaveFormat obj=new WaveFormat();
        obj.method(arr,n);
        for (int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
    }
}