package com.campusdual;

public class Exercise7 {
    public static void main(String[] args) {
      for(int i = 1; i <=15; i++){
          System.out.println("Número: " + i);
      }

      int sum = 0;
      for(int i = 1; i <= 100; i++){
          sum += i;
      }

        System.out.println("Suma de los 100 primeros números: " + sum);
    }
}
