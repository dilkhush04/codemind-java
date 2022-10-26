import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    private static long gcd(long a, long b){
        if(a==0) return b;
        else return gcd(b%a,a);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		while(T-- > 0){
		    long n = in.nextLong();
		    long a = in.nextLong();
		    long b = in.nextLong();
		    long k = in.nextLong();
		    long cnt = 0;
		    long lcm = a*b/gcd(a,b);
		    long ans = n/a + n/b - 2*(n/lcm);
		    System.out.println(ans>=k?"Win":"Lose");
		}
	}
}
