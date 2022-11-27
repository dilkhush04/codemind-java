import java.util.*;
class OctalToBinary {
    public static String converter(String octalValue)
    {
 
        int octal = Integer.parseInt(octalValue, 8);
        String binaryValue = Integer.toBinaryString(octal);

        return binaryValue;
    }
 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String octalNumber = sc.next();
        String result = converter(octalNumber);
        System.out.println(result);
    }
}