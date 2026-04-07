import java.util.*;
public class EvenOdd {

    public static void main(String args[])
    {
        System.out.println("Check Even or Odd number...");
         Scanner sc = new Scanner(System.in);
         int no = sc.nextInt();

         if(no % 2 == 0)
         {
            System.out.println("Number is Even..");
         }
         else
         {
            System.out.println("Number is Odd..");
         }
    }
    
}
