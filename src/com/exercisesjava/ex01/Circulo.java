package com.exercisesjava.ex01;

public class Circulo implements Forma{

    public double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI * (raio * raio);
        //Circunferencia = 2 . 3,14 .raio (c = 2πr)
    }
}
