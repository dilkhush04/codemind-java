import java.util.*;
 class Main {
 
  public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
    int[] array=new int[n];
    for(int i=0;i<n;i++)
    {
         array[i]=sc.nextInt();
    }
    int result = array[0];
 
    //Loop through the array and find GCD
    //by combining the GCD of previous numbers 
    for(int i=1; i<n; i++){
      result = findGCD(array[i], result);
    }
    System.out.print(result);
  }
 
  //function to find GCD of two numbers
  public static int findGCD(int a, int b){
    if(b == 0)
      return a;
    return findGCD(b, a%b);
  }

}