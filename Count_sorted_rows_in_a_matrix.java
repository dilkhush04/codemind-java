import java.util.*;
class SortedCPont {
    static int sortedCount(int mat[][], int r, int c)
    {
        int result = 0; 
        for (int i = 0; i < r; i++) {
            
            int j;
            for (j = 0; j < c - 1; j++)
                if (mat[i][j + 1] <= mat[i][j])
                    break;
                    
            if (j == c - 1)
                result++;
        }
 
        for (int i = 0; i < r; i++) {
           
            int j;
            for (j = c - 1; j > 0; j--)
                if (mat[i][j - 1] <= mat[i][j])
                    break;
            if (c > 1 && j == 0)
                result++;
        }
        return result;
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int m =sc.nextInt();
        int n = sc.nextInt();
        int mat[][] =new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.print(sortedCount(mat, m, n));
    }
}