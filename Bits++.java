import java.util.*;
class Bits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        for (int k=0;k<n;k++)
        {   
            String str=sc.next();
            for (int i=0;i<3;i++)
            {
                if (str.charAt(i)=='+')
                {
                    x+=1;
                    break;
                }
                else 
                if (str.charAt(i)=='-')
                {
                    x-=1;
                    break;
                }
        }
        
    }
    System.out.print(x);
}
}