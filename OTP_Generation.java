import java.util.*;
class OTP{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        for(int i=0;i<str.length();i++)
        {
            int num=str.charAt(i)-'0';
            if(num%2!=0){
                System.out.print(num*num);
            }
        }
    }
}