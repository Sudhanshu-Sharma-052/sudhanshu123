import java.util.Scanner;
public class R1 {
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      //int n=1234;
      System.out.println("Enter the number:");
      int n=sc.nextInt();
      int sum=0;
      int m=n;
      int count=0;
      while(n>0)

      {
         count++;
         n=n/10;
      }
      for (int i=0;i<count;i++)
      {int r=m%10;
         sum=sum*10+r;
         m=m/10;
      }
      System.out.println("The reverse number is:"+sum);

   }
   
}
