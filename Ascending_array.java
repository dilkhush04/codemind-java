import java.util.*;
class AscendingArray
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int temp=-9999;
        int flag=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(temp<arr[i])
            {
                temp=arr[i];
            }
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}