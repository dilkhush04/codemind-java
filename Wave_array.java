import java.util.*;
class WaveArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(n%2==0)
        {
            int flag=0;
            if(a[0]<a[1])
            {
                
                for(i=0;i<n;i=i+2)
                {
                    for(j=i+1;j<n;j++)
                    {
                        if(a[i]<a[j])
                        {
                            break;
                        }
                        else
                        {
                            flag=1;
                        }
                        
                    }
                }
                
            }
            
            else
            {
                
                for(i=0;i<n;i=i+2)
                {
                    for(j=i+1;j<n;j++)
                    {
                        if(a[i]>a[j])
                        {
                            break;
                        }
                        else
                        {
                            flag=1;
                        }
                        
                    }
                }
            }
            if(flag==0)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
            
            
        }
        
        else
        {
            int flag=0;
             if(a[0]<a[1])
            {
                
                for(i=0;i<n;i=i+2)
                {
                    for(j=i+1;j<n;j++)
                    {
                        if(a[i]<a[j])
                        {
                            break;
                        }
                        else
                        {
                            flag=1;
                        }
                        
                    }
                    if(i==n-1)
                    {
                        if(a[i-1]>a[i])
                        {
                            break;
                        }
                        else
                        {
                            flag=1;
                            break;
                        }
                    }
                    
                }
                
            }
            else
            {
                
                for(i=0;i<n;i=i+2)
                {
                    for(j=i+1;j<n;j++)
                    {
                        if(a[i]>a[j])
                        {
                            break;
                        }
                        else
                        {
                            flag=1;
                        }
                        
                    }
                    if(i==n-1)
                    {
                        if(a[i-1]<a[i])
                        {
                            break;
                        }
                        else
                        {
                            flag=1;
                            break;
                        }
                    }
                    
                }
            }
            if(flag==0)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}