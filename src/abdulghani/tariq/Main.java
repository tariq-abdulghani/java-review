package abdulghani.tariq;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World Java??");
        // primitives
        byte b = 4;
        short sh = 300;
        int integer = 1000;
        long longInteger = 1000000;
        float fl = 56.7f;
        double dbl = 45.78;
        BigDecimal bigDecimal = new BigDecimal(456.89898980);
        char ch = 'a';
        boolean isRight = true;

//        for (String s: args){
//            System.out.println(s);
//        }
        // arrays
        int[] ints = {1, 2, 3, 4};

        System.out.println("min int:" + Integer.MIN_VALUE + " "+" max int: "+ Integer.MAX_VALUE);
        System.out.println(Arrays.toString(ints));

        Car car = new Car("Hunda", 1600, 2021);
        System.out.println("before manipu:" + car);
//        manipulateCarMade("po", car);
        assignNewCar(car);
        System.out.println("after manipu: " + car);
    }

    public static void  manipulateCarMade(String made, Car car){
        car.setMade(made);
    }

    public static void  assignNewCar(Car car){
        car = new Car("new", 0,0);
    }
}
