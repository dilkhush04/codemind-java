import java.util.*;
class Word
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i;
        String[] a=s.split(" ");
      int   len=a.length;
        for(i=0;i<len;i++)
        {
            System.out.print(a[i].length()+" ");
        }
    }
}