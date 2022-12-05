import java.util.*;
class ContainsExample {
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       while(n>0)
       {
      String sample = sc.next();
      int flag=0;
      char[] chars = sample.toCharArray();
      //StringBuilder sb = new StringBuilder();
      for(char c : chars){
         if(Character.isDigit(c)){
            System.out.println("Yes");
            flag=1;
            break;
         }
      }
      if(flag==0)
      System.out.println("No");
      n--;
   }
   }
}