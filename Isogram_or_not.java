import java.util.*;
 
class Isogram {
    public static boolean pang(String str)
    {
        char[] mark = new char[1000];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            mark[i]=str.charAt(i);
        }
        for (int i = 0; i < str.length(); i++) {
            for(int j=i+1;j<str.length();j++)
            {
                if(mark[i]==mark[j])
                {
                    return (false);
                    
                }
            }
        }
        return (true);
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
 
        if (pang(str) == true)
            System.out.print("True");
        else
            System.out.print("False");
    }
}