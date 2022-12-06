import java.util.*; 

class Word
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] str=s.split(" ");
        int sum1=0,sum2=0;
        for(int i=0;i<str.length;i++)
        {
            char min='0';
            char max='0';
            int temp=999;
            int temp1=-999;
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
            sum1+=temp;
            sum2+=temp1;
        }
        System.out.print(sum2-sum1);
    }
}