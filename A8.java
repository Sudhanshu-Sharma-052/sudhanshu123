public class A8 {
   public static void main(String args[])
   {
      int arr[] = {0,1,2,3,5};
      int n = arr.length;
      int totalSum = n*(n+1)/2;
      int arrSum = 0;
      for (int i=0;i<n;i++)
       {
      arrSum += arr[i];
}
int missing = totalSum - arrSum;
    System.out.println("missing is" + missing);
   }
}