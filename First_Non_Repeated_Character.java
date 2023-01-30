import java.util.*;
class FNRC
{
    public static boolean check(String str, char j){
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==j)
            {
                c++;
            }
        }
        if(c==1)
        return true;
        else
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            boolean state=false;
            int n=sc.nextInt();
            sc.nextLine();
            String str=sc.next();
            for(int i=0;i<str.length();i++)
            {
                if(check(str, str.charAt(i)))
                {
                    state=true;
                    System.out.println(str.charAt(i));
                    break;
                }
            }
            if(state==false)
            System.out.println("-1");
        }
    }
}