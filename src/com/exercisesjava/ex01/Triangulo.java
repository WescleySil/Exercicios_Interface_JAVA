package com.exercisesjava.ex01;

public class Triangulo implements Forma{

    public double base;
    public double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura =  altura;
    }

    @Override
    public double getArea() {
        return (base * altura)/2;
        //Area = (base . altura) ÷ 2 (a = (b.h)÷2)
    }
}
