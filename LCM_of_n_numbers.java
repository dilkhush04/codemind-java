
import java.util.*;

class Main {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
    int array[] = new int[n];
    for(int i=0;i<n;i++)
    {
        array[i]=sc.nextInt();
    }
    
    //initialize LCM and GCD with the first element
    int lcm = array[0];
    int gcd = array[0];
 
    //loop through the array to find GCD
    //use GCD to find the LCM
    for(int i=1; i<n; i++){
      gcd = findGCD(array[i], lcm);
      lcm = (lcm*array[i])/gcd;
    }
    
    //output the LCM
    System.out.println(lcm);
  }
 
  //recursive function to find GCD of two numbers
  public static int findGCD(int a, int b){
    //base condition
    if(b == 0)
      return a;
    
    return findGCD(b, a%b);
  }
}