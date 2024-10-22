package org.example.Java.Act5;

public class Personaje1 {
    String nombre;
    int edad;
    int vida;
    int ataque;

    public Personaje1(String nombre, int edad, int vida, int ataque) {
        this.nombre = nombre;
        this.edad = edad;
        this.vida = vida;
        this.ataque = ataque;
    }


    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Vida: " + vida);
        System.out.println("Ataque: " + ataque);

    }




}
