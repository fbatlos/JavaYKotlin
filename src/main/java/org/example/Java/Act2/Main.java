package org.example.Java.Act2;

public class Main {
    public static void main(String[] args) {
        int estamina = 40;

        String estado;

        if (estamina<50){
            estado = "Cansado";
        }
        else {
            estado = "Fresco";
        }

        System.out.println(estado);
    }
}
