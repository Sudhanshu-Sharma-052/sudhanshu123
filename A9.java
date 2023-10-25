public class A9 {
   public static void main(String args[])
   {
      int arr[] = {1,2,3,4,5};
      int n = arr.length;
      int i =0;
      int j = n-1;
      while(i<j){
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      i++;
      j--;
   }
   for(i=0;i<n;i++)
   System.out.print(arr[i]+ " ");
}
}
