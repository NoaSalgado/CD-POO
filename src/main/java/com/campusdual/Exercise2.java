package com.campusdual;

public class Exercise2 {
    public static void main(String[] args) {
        double radio = 15.0;
        double longitude = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("Longitude: " + longitude);
        System.out.println("Area: " + area);

    }
}
