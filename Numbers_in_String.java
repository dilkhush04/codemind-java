import java.util.*;
class NumberInString
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int sum=0;
        char[] chars=str.toCharArray();
        for(char ch: chars)
        {
            if(Character.isDigit(ch))
            {
                sum+=ch-'0';
            }
        }
        System.out.println(sum);
    }
}

