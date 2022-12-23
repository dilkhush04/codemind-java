import java.util.*;
class String_Balanced
{
    static int string(String s)
    {
        int c=0;
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='L')
            c++;
            if(s.charAt(i)=='R')
            c--;
            if(c==0)
            count++;
            
        }
        return count;
    }
}
class Demo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String_Balanced obj=new String_Balanced();
        System.out.println(obj.string(str));
        
    }
}