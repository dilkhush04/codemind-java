import java.util.Scanner;  
class CountElementNotDidv_k   
{  
public static void main(String[] args)   
{
    int n;
    int c=0;
    Scanner sc=new Scanner(System.in);  
    n=sc.nextInt();
    int k=sc.nextInt();
    int[] array = new int[n];
    for(int i=0; i<n; i++)  
        {  
            array[i]=sc.nextInt();  
        }  
    for (int i=0; i<n; i++)   
    {  
        if(array[i]%k!=0)
            {
                c++;
            }
    } 
    System.out.println(c); 
    }  
}