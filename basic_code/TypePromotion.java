

public class TypePromotion {
     public static void main(String args[])
    {   //Rule:1
        short a= 2;
        byte b= 3;
        char c= 'c';
        byte by= (byte) (a +b +c);
        System.out.println(by); 
        System.out.println((int)a);
        System.out.println((int)b);
        System.out.println((float)b-a);
        System.out.println(a*b);

        //Rule:2
        int p=12;
        long s=40;
        float q=1.12f;
        double r=12.12;
        double sum=p+q+r+s;
        System.out.println(sum);
    }
    
}
