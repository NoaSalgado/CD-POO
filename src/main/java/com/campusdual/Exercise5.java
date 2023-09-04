package com.campusdual;

import com.campusdual.util.Input;

public class Exercise5 {
    public static void main(String[] args) {
        int num1 = Input.integer("Write a number: ");

        if(num1 > 0){
            System.out.println(num1 + " is a positive number");
        }else{
            System.out.println(num1 + " negative number");
        }

        int num2 = Input.integer("Write another number: ");

        if(num2 % num1 == 0){
            System.out.println(num2 + " is " + num1 + " multiple");
        }else{
            System.out.println(num2 + " is not" + num1 + " multiple");
        }

        if(num1 < num2){
            System.out.println(num1 + " is less than " + num2);
        }else{
            System.out.println(num1 + " is bigger than " + num2);
        }
    }
}
