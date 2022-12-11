import java.util.*;
class LowerCase
{
    static void lower(String str)
    {
        str=str.toLowerCase();
        System.out.println(str);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        LowerCase obj=new LowerCase();
        obj.lower(str);
    }
}

