package org.example;

/**
 * @author juanq
 **/
public class Brazor {

    String name;
    protected String brand;

    public static void main(String[] args) {
        Brazor brazor = new Brazor();
        brazor.name = "Gillette";
        System.out.println("Brazor name: "+brazor.name);
    }
}
