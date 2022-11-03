import java.util.Scanner;
class MissingNumber {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num=sc.nextInt();
      int k;
      int a[] = new int[num];
      for(k=0;k<num;k++)
      {
      int n = sc.nextInt();
      int inpuArray[] = new int[n];
      for(int i=0; i<n-1; i++) {
         inpuArray[i] = sc.nextInt();
      }
      int sumOfAll = (n*(n+1))/2;
      int sumOfArray = 0;
      for(int i=0; i<=n-2; i++) {
         sumOfArray = sumOfArray+inpuArray[i];
      }
      int missingNumber = sumOfAll-sumOfArray;
      a[k]=missingNumber;
      }
      for(k=0;k<num;k++)
      {
          System.out.println(a[k]);
      }
   }
}