import java.util.*;
class MaxOf_String
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int temp=-999;
        char c=NULL;
        char[] chars=str.toCharArray();
        for(char ch: chars)
        {
            if(temp<(int)ch)
            {
                temp=(int)ch;
                c=ch;
                
            }
            
            
        }
        System.out.println(c);
    }
}

