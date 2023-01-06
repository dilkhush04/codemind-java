import java.util.*;  
class Balanced_Array {  
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] arr=new int[n];  
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int flag=0;
            for(int i=0;i<n;i++){  
                int left_sum=0;  
                int right_sum=0;  
              
                for(int j=0;j<i;j++){  
                left_sum+=arr[j];  
            }  
              
            for(int j=i+1;j<n;j++){  
                right_sum+=arr[j];  
            }  
              
            if(left_sum==right_sum)  
            flag=1; 
        } 
        if(flag==1)
        System.out.println("YES");
        else
        System.out.println("NO");
        }
        
    }  
}  