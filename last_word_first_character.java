import java.util.*;
class Word
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(" ");
        String str1=str[str.length-1];
        char ch=(str1.charAt(0));
        System.out.print(ch);
    }
}