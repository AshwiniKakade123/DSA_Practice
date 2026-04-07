import java.util.*;
public class BilWithTax {

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float pencile=sc.nextFloat();
        float pen=sc.nextFloat();
        float eraser=sc.nextFloat();

        float total=pen+pencile+eraser;

        System.out.println("bill is:"+total);

        float newtotal= total+(0.18f*total);
        System.out.println("Bill with 18% tax:"+newtotal);
    }
}

