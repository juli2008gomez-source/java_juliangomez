package com.example;

// 10 atributos
public class Animal {
    private String nombre;
    private String tipo;
    private int patas;
    private int edad;
    private String pelaje;
    private String color;
    private double peso;
    private char sexo;
    private double altura;
    private boolean cola;

    //Constructor  Vacio
    public Animal() {
        
    }
    //Constructor parametrizado usando this
    public Animal(String nombre, String tipo, int patas, int edad, String pelaje, String color, double peso, char sexo, double altura, boolean cola) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.patas = patas;
        this.edad = edad;
        this.pelaje = pelaje;
        this.color = color;
        this.peso = peso;
        this.sexo = sexo;
        this.altura = altura;
        this.cola = cola;
    }
    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public boolean getCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    @Override 
    public String toString() {
        return "Animal{" +
            "nombre='" + nombre + '\'' +
            ", tipo='" + tipo + '\'' +
            ", patas=" + patas +
            ", edad=" + edad +
            ", pelaje='" + pelaje + '\'' +
            ", color='" + color + '\'' +
            ", peso=" + peso +
            ", sexo=" + sexo +
            ", altura=" + altura +
            ", cola=" + cola +
            '}';
    }
}