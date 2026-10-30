package com.example;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setNombre("Lola");
        animal.setTipo("Perro");
        animal.setPatas(4);
        animal.setEdad(5);
        animal.setPelaje("Corto");
        animal.setColor("Negro");
        animal.setPeso(10.5);
        animal.setSexo('H');
        animal.setAltura(0.5);
        animal.setCola(true);

        System.out.println("animal 1");
        System.out.println(animal);
    }
}