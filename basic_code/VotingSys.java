import java.util.*;
public class VotingSys{


            public static void main(String args[])
            {
            System.out.println("Check Eligible or not for voting..");
            Scanner sc =new Scanner(System.in);
            int age = sc.nextInt();

            if(age>18)
            {
                System.out.println("Eligible..");
            }
            else
            {
                System.out.println("NOt Eligible..");
            }

            }

}
