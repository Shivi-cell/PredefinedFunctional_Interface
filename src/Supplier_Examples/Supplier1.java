package Supplier_Examples;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier1 {
    public static void main(String[] args) {
        // supplier for supplying date
        Supplier s1 = () -> new Date();
        System.out.println(s1.get());

        // supplier for supplying otp
        Supplier s2 = () -> {
            String otp = "";
            for (int i = 0; i < 6; i++) {
                otp = otp + (int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println("otp is "+s2.get());
        System.out.println("otp is "+s2.get());
        System.out.println("otp is "+s2.get());
    }
}
