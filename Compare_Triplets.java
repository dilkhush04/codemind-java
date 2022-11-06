import java.util.*;
class CompareTriplate
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,aa=0,bb=0;
        int[] a=new int[300];
        int[] b=new int[300];
        for(i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
         for(i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
          for(i=0;i<3;i++)
        {
            if(a[i]>b[i])
            {
                aa++;
            }
            else
            if(a[i]==b[i])
            {
                continue;
            }
            else
            {
                bb++;
            }
        }
        System.out.println(aa+" "+bb);
        
    }
}