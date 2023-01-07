import java.util.*;
class ExcelSheet{
    public static void ColumnSheet(int n)
    {
        StringBuilder namesheet=new StringBuilder();
        while(n>0)
        {
            int rem=n%26;
            
            
            if(rem==0)
            {
                namesheet.append("Z");
                n=(n/26)-1;
            }
            
            else
            {
                namesheet.append((char)((rem - 1) + 'A'));
                n=n/26;
            }
            
        }
        System.out.println(namesheet.reverse());
    }
}
class Demo{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ExcelSheet obj= new ExcelSheet();
        obj.ColumnSheet(n);
    }
}