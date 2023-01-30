import java.util.*;
class Factor{
    static int factor(int num){
        int sum=0;
        for(int j=1;j<=num;j++){
                if(num%j==0){
                    sum+=j;
                }
            }
            return sum;
        }
    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr=s.split(",",40);
        ArrayList<Integer> list =new ArrayList<Integer>();
       
        
        for (int i=0;i<arr.length;i++)
            list.add(Integer.valueOf(arr[i]));
        
        boolean f=false;
         ArrayList<Integer> list1 =new ArrayList<Integer>();
        for(int ele:list)
        {
            if(list.contains(factor((ele))))
            {
                f=true;
                list1.add(ele);
                
            }
        }
        
        if (f==false)
            System.out.print(-1);
        else
        {
            Collections.sort(list1);
            for (int ele:list1)
                System.out.print(ele+" ");
        }
    }
}
