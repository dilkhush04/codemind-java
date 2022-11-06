import java.util.*;
class RotateRight {    
 public static void main(String[] args) { 
     Scanner sc=new Scanner(System.in);
        //Initialize array     
        int [] arr = new int[100];    
        
        int l =sc.nextInt();    
           
        for(int i=0;i<l;i++)
        {
            arr[i]=sc.nextInt();
        }
            int n =sc.nextInt();
        for(int i = 0; i < n; i++){    
            int j, last;    
            //Stores the last element of array    
            last = arr[l-1];    
            
            for(j = l-1; j > 0; j--){    
                arr[j] = arr[j-1];    
            }    
            //Last element of array will be added to the start of array.    
            arr[0] = last;    
        }    
        
       // System.out.println();    
            
       
        for(int i = 0; i< l; i++){    
            System.out.print(arr[i] + " ");    
        }    
    }    
} 