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
            int temp=999,c=0,m=0;
            int temp1=-999;
        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<str[i].length();j++)
            {
                char ch=str[i].charAt(j);
                {
                    if((int)ch<temp)
                    {
                        temp=(int)ch;
                        min=ch;
                    }
                    if((int)ch>temp1)
                    {
                        temp1=(int)ch;
                        max=ch;
                    }
                    
                }
            }
            
        }
        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<str[i].length();j++)
            {
                char ch=str[i].charAt(j);
                {
                    if(ch==min)
                    {
                       c++;
                    }
                    if(ch==max)
                    {
                        m++;
                    }
                    
                }
            }
            
        }
        System.out.print(min+" "+c+" "+max+" "+m);
    }
}