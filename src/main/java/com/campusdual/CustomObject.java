package com.campusdual;

public class CustomObject {
    private int actualFuel = 10;

    public void setActualFuel(int fuel){
        if(fuel < 0){
            System.out.println("La capacidad no puede ser negativa");
        }else{
            this.actualFuel = fuel;
        }
    }

    public void showDetails(){
        System.out.println("La capacidad actual es de " + this.actualFuel + " litros");
    }

    public static void main(String[] args) {
        CustomObject ob = new CustomObject();
        ob.showDetails();
        System.out.println("Actualización de capacidad");
        ob.setActualFuel(-8);
        ob.showDetails();
    }
}
