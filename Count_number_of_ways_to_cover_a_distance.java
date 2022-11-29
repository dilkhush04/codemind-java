import java.util.*;
class CountNumber_of_Ways_to_cover_a_Distsnce
{
    static int Count(int dist)
    {
        if (dist<0)   
            return 0;
        if (dist==0)   
            return 1;
        return Count(dist-1) + Count(dist-2) + Count(dist-3);
    }
     
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int dist =sc.nextInt();
        System.out.println(Count(dist));
    }
}