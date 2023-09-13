package com.exercisesjava.ex01;

public class Main {
    public static void main(String[] args) {
            Retangulo retangulo = new Retangulo(10,12);
            Circulo circulo = new Circulo(3);
            Triangulo triangulo = new Triangulo(4,6);

        System.out.println("Área do retangulo: "+ retangulo.getArea());
        System.out.println("Área do circulo: "+ circulo.getArea());
        System.out.println("Área do triangulo: "+ triangulo.getArea());
    }
}
