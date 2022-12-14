import java.util.*;
class Solution {
    public static int Balloons(String str) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;
        
        for(char ch : str.toCharArray()){
            switch(ch){
                case 'b': 
                    b++;
                    break;
                case 'a': 
                    a++;
                    break;
                case 'l': 
                    l++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'n':
                    n++;
                    break;
            
            }
        }
        
        return Math.min(Math.min(o/2, l/2), Math.min(Math.min(b, a), n));
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(Balloons(str));
    }
}