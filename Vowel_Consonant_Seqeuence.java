import java.util.*;
class Vowel_Constant{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int k=0;
        char[] arr=new char[100];
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                arr[k++]='V';
                
            }
            else
            {
                arr[k++]='C';
               
            }
        }
        char ch=arr[0];
        System.out.print(ch);
        for(int i=1;i<k;i++){
            if(arr[i]!=ch){
                System.out.print(arr[i]);
            }
            ch=arr[i];
        }
        
    }
}