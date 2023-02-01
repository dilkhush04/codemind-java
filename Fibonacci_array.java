import java.util.*;
class Fibb{
    static int check(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int flag=1;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        if(n<3){
            System.out.println("no");
        }
        else
        {
            for(int i=2;i<n;i++){
                if(a[i]!=check(a[i-2],a[i-1])){
                    flag=0;
                    break;
                    
                }
                    
            }
            if(flag==0)
            System.out.println("no");
            else
            System.out.println("yes");
        }
        
        
    }
}