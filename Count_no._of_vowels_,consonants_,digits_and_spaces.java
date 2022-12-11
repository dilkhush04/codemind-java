import java.util.*;
class Counting
{
    static void counting(String str)
    {
        int vowel=0,cons=0,digit=0,space=0;
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            {
                ch=Character.toLowerCase(ch);
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
                {
                    vowel++;
                }
                else
                {
                    cons++;
                }
            }
            else
            if(ch>='0' && ch<='9')
            {
                digit++;
            }
            else
            {
               space++ ;
            }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + cons);
        System.out.println("Digits: " + digit);
        System.out.println("White spaces: " + space);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Counting obj=new Counting();
        obj.counting(str);
    }
}

