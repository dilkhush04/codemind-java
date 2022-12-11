import java.util.*;
class Stringdigit {
   public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str = sc.next();
        int count=0;
        char[] chars = str.toCharArray();
        for(char c : chars){
            if(Character.isDigit(c)){
                count++;
            }
        }
        if(count==0)
        System.out.println("Doesn't contain digit");
        else
        System.out.println("Contains "+count+" digit");
     
   
   }
}