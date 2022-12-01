import java.util.*;
class IPAdress{
static String GeberateDefangIP(String str)
{
    String defangIP = "";
    
    for(int i = 0; i < str.length(); i++)
    {
       char c = str.charAt(i);
       if(c == '.')
       {
           defangIP += "[.]";
       }
       else
       {
           defangIP += c;
       }
    }
    return defangIP;
}

public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    String str = sc.next();
     
    System.out.println(GeberateDefangIP(str));
}
}