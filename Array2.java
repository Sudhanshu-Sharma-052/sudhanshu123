public class Array2 {
   public static void main(String[] args)
   {
   int arr[] = {5,8,11,2,3,1,13};
   int min = arr[0];
   for(int i=0;i< arr.length;i++){
   if(arr[i]<min){
   min = arr[i];
   }
}
   System.out.println("the min element is"+min);   
}
}
   

