import java.util.*;
class Test {
    // Function to check Automorphic number
    static boolean isAutomorphic(int N)
    {
        int sq = N * N;
        while (N > 0) {
         
            if (N % 10 != sq % 10)
                return false;
            N /= 10;
            sq /= 10;
        }
 
        return true;
    }
 
    // Driver method
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
 
        System.out.println(isAutomorphic(N) ? "Automorphic Number" : "Not an Automorphic Number");
    }
}