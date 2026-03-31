package com.gadev;

public class Calculadora {
    private double num1;
    private double num2;

    public Calculadora(){};

    public Calculadora(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double calcularSuma(double num1, double num2) {
        return num1 + num2;
    }

    public double calcularResta(double num1, double num2) {
        return num1 - num2;
    }

    public double calcularMultiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    public double calcularDivision(double num1, double num2) {
        if (num2 == 0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        return num1 / num2;
    }

}
