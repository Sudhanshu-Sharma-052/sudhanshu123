public class Array14 {
   public static void main(String[] args)
   {
   int arr[] = {2,8,3,7,5,4};
   int min = arr[0];
   int max = arr[0];
   //int totalsum=0;
   for(int i=0;i< arr.length;i++){
   if(arr[i]<min){
   min = arr[i];
   }
}
   for(int i=0;i<arr.length;i++){
      
      if(arr[i]>max){
      max = arr[i];
      }
   }
      System.out.println("the max element is"+max);

   System.out.println("the min element is"+min);
   //for(int i=min;i<max;i++)
   
}  
} 






