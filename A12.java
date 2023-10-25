public class A12 {
   public static void main(String args[])
   {
      int arr[]={0,1,0,0,0,1,1,0};
      int zerCount=0;
      for(int i=0;i<arr.length;i++)
   {
      if(arr[i]==0)
      zerCount += 1;
   } 
   for(int i=0;i<arr.length;i++){
      if(i<zerCount){
         arr[i]=0;
   }
   else{
   arr[i]=1;
   }
   }
   for(int i:arr){
      System.out.print(i+" ");
   }
   }
   
}
