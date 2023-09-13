package com.exercisesjava.ex01;

public class Retangulo implements Forma{

    public double base;
    public double altura;

    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base * altura;
        //Area = base . altura (a = b.h)
    }
}
