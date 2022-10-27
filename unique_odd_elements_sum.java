import java.util.*;
class RemoveDuplicateInArrayExample
{ public static int removeDuplicateElements(int arr[], int n)
{ if (n==0 || n==1){ return n; } 
int[] temp = new int[n]; 
int j = 0; 
for (int i=0; i<n-1; i++)
{ if (arr[i] != arr[i+1])
{ temp[j++] = arr[i];
} 
    
} 
temp[j++] = arr[n-1]; 
// Changing original array 
for (int i=0; i<j; i++){ arr[i] = temp[i]; 
    
} 
return j;
}
public static void main (String[] args) 
{ Scanner sc=new Scanner(System.in);
int num=sc.nextInt(); 
int[] arr= new int[num];
int k; int sum=0; 
for(k=0;k<num;k++) 
{ arr[k]=sc.nextInt(); 
    
}
int length = num; 
length = removeDuplicateElements(arr, length); // printing array elements ;
for (int i=0; i<length; i++) 
{ if(arr[i]%2!=0) { sum=sum+arr[i]; 
    
} 
    
} 
System.out.println(sum);
} 
    
}