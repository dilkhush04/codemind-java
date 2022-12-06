import java.util.*;
 
class FirtUCInSring {
  public static void FirstNonRepeat(String s)
  {
       int k=0;
    for (int i = 0; i < s.length(); i++) {
 
      if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
          k++;
        System.out.println(s.charAt(i));
        break;
      }
    }
    if(k==0)
    System.out.println("-1");
    return;
  }
  public static void main (String[] args) {
      Scanner sc=new Scanner(System.in);
    String s = sc.nextLine();
    FirstNonRepeat(s);
  }
}