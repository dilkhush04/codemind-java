import java.util.*;
class Parenthesis
{
    static boolean parethesis(String s)
    {
        int star=0;
        int lp=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                star+=1;
            }
            else if(s.charAt(i)=='(')
            {
                lp+=1;
            }
            else if(s.charAt(i)==')')
            {
                lp-=1;
            }
            if(-lp>star)
            {
                return false;
            }
        }
        int rp=0;
        star=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='*')
            {
                star+=1;
            }
            else if(s.charAt(i)==')')
            {
                rp+=1;
            }
            else if(s.charAt(i)=='(')
            {
                rp-=1;
            }
            if(-rp>star)
            {
                return false;
            }
        }
        return true;
    }
}
class Matching
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Parenthesis obj=new Parenthesis();
        if(obj.parethesis(s))
        System.out.println("True");
        else
        System.out.println("False");
    }
}