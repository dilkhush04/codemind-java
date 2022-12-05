import java.util.*;
class VowelCount {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        String str =sc.nextLine();
        char s =sc.next().charAt(0);
        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==s)
            {
                System.out.println("True");
                System.out.print(i);
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.print("False");
        }
    
    }
}