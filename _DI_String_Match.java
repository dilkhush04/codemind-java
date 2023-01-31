import java.util.*;
class DI_MATCH{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int k=0;
        int num=0,n=str.length();
        int[] a=new int[100];
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='I')
            {
                a[k++]=num;
                num++;
            }
            else
            {
                a[k++]=n;
                n--;
            }
        }
        a[k]=num;
        for(int i=0;i<=k;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}