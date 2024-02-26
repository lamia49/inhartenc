
import java.lang.reflect.Field;
import java.security.cert.CertPathValidatorException;

public class Main {
    public static void main(String[] args) {
        Circle c2 = new Circle("green", true, 4.5);;
        System.out.println("Area is "+c2.getArea());
        System.out.println("Peraimeter is: "+c2.getPraimeter());
        System.out.println(c2.toString());
        Rectangle r1=  new Rectangle("black",true ,4,3);
        System.out.println(r1.toString());
        System.out.println("the ares is: "+r1.area());
        System.out.println("the perimeter is: "+r1.peraimeter());
        Square s1 =new Square("red",false,4,4);
        System.out.println(s1.toString());
        System.out.println("Area of squre: "+ s1.area());
        System.out.println("Perimeter is "+s1.peraimeter());



    }
}