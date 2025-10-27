package org.example.data;

import org.example.app.Brazor;

/**
 * @author juanq
 **/
public class HijoBrazor extends Brazor {

    {
        brand = "Gillette";
        System.out.println("HijoBrazor brand: "+brand);
    }

    public HijoBrazor() {
        brand = "Adidas";
        System.out.println("HijoBrazor brand: "+brand);
    }

    public static void main(String[] args) {
//    Brazor brazor = new Brazor();
//    brazor.name = "Gillette";
//
//    HijoBrazor hijoBrazor = new HijoBrazor();
//    hijoBrazor.name = "Gillette";

//    Brazor brazor = new HijoBrazor();
//    brazor.brand = "Gillette";  ERROR

        HijoBrazor hijoBrazor = new HijoBrazor();
        hijoBrazor.brand = "Gillette";

    }

    {
        brand = "Nike";
        System.out.println("HijoBrazor brand: "+brand);
    }
}
