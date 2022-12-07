import java.util.*;
 
class Anagram {
    public static boolean anag(String str,String str1)
    {
        char[] mark = new char[1000];
        int c=0;
         char[] mark1 = new char[1000];
         if(str.length()!=str1.length())
         return (false);
         
        for (int i = 0; i < str.length(); i++) {
            mark[i]=str.charAt(i);
        }
        for (int i = 0; i < str1.length(); i++) {
            mark1[i]=str.charAt(i);
        }
        for (int i = 0; i < str.length(); i++) {
            for(int j=0;j<str1.length();j++)
            {
                if(mark[i]==mark1[j])
                {
                   c++;
                    
                }
            }
        }
        if(c==str.length())
        return (true);
        else
        return (false);
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String str1=sc.nextLine();
 
        if (anag(str,str1) == true)
            System.out.print("True");
        else
            System.out.print("False");
    }
}