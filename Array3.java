public class Array3 {
   public static void main(String[] args)
   {
   int arr[] = {5,8,11,2,3,1,13};
   int max = arr[0];
   for(int i=0;i<arr.length;i++){
      
   if(arr[i]>max){
   max = arr[i];
   }
}
   System.out.println("the max element is"+max);   
}
}

