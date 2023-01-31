import java.util.*;
class Camel{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int c=0;
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                c++;
            }
        }
        if(Character.isLowerCase(str.charAt(0)))
        c=c+1;
        System.out.println(c);
    }
}