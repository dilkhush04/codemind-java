import java.util.*; 

class Word
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(" ");
            char min='0';
            char max='0';
            int temp=999;
            int temp1=-999;
            for(int j=0;j<str[0].length();j++)
            {
                char ch=str[0].charAt(j);
                {
                    if((int)ch<temp)
                    {
                        temp=(int)ch;
                        min=ch;
                    }
                    
                }
            }
            for(int j=0;j<str[str.length-1].length();j++)
            {
                char ch=str[str.length-1].charAt(j);
                {
                    if((int)ch>temp1)
                    {
                        temp1=(int)ch;
                        max=ch;
                    }
                    
                }
            }
            
        
        System.out.print(min+" "+max+" ");
    }
}