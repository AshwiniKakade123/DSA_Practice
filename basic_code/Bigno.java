import java.util.*;
public class Bigno {

    public static void main(String args[])
    {
        System.out.println("Check Big number...");
         Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();

        if(a==b)
        {
            System.out.println(+a+" & " +b + " Both are same..");
        }
        else
        {
         if(a>b)
         {
            System.out.println(+a+ " is Big");
         }
         else
         {
            System.out.println(+b+ " is Big");
         }
        }
    }
    
}
