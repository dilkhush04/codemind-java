import java.util.Scanner;  
class DigitCount   
{  
public static void main(String[] args)   
{
    int c=0;
    Scanner sc=new Scanner(System.in);  
    int n=sc.nextInt();
    while(n!=0)
    {
        c++;
        n/=10;
    }
    
    System.out.println(c); 
    }  
}