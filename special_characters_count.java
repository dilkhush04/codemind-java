import java.util.*;
class CountingSpecial
{
    static void counting(String str)
    {
        int special=0;
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            char ch=str.charAt(i);
            int num=(int)ch;
            if((num>=33 && num<=47) ||(num>=58 && num<=64) ||(num>=123 && num<=126)|| (num>=91 && num<=96))
            {
               special++ ;
            }
        }
        System.out.println(special);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        CountingSpecial obj=new CountingSpecial();
        obj.counting(str);
    }
}
