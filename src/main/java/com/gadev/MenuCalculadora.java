package com.gadev;

import java.util.Scanner;

public class MenuCalculadora {

    Scanner scanner = new Scanner(System.in);
    Calculadora calc = new Calculadora();

    public void start(){

        boolean continuar = true;

        while(continuar){
            printMenu();
            int command = scanner.nextInt();

            switch (command){
                case 1:
                    System.out.println(calc.calcularSuma(n1,n2)); break;
                case 2: System.out.println(calc.calcularResta(n1,n2)); break;
                case 3: System.out.println(calc.calcularMultiplicacion(n1,n2)); break;
                case 4: try {
                    System.out.println(calc.calcularDivision(n1,n2)); break;
                } catch (ArithmeticException e){
                    System.out.println("Error: " + e.getMessage());
                }; break;
                case 5: continuar = false; break;
                default:
                    System.out.println("Ingrese un comando valido");
            }

        }
    }

    public void printMenu(){
        System.out.println("CALCULADORA");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicar");
        System.out.println("4. Division");
        System.out.println("5. Salir");
    }




}
