import java.util.*;
class StringC
{
    static void string(String str)
    {
      char arr[]=str.toCharArray();
      Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
        
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        StringC obj=new StringC();
        obj.string(str1+str2);
    }
}

