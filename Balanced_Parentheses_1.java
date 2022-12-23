import java.util.*;
class Balanence
{
        public static boolean isValid(String s) {
            
    	Stack<Character> stack = new Stack<Character>();
    	for (char c : s.toCharArray()) {
    		if (c == '(')
    			stack.push(')');
    		else if (c == '{')
    			stack.push('}');
    		else if (c == '[')
    			stack.push(']');
    		else if ( stack.pop() != c)
    			return false;
    	}
    
    	return true;
    }
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    String str=sc.next();
	    if(isValid(str))
	    System.out.println("True");
	    else
	    System.out.println("False");
	}
}
