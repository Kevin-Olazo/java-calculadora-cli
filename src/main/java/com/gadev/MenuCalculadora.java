package com.gadev;

import java.util.Scanner;

public class MenuCalculadora {

    private static final Scanner scanner = new Scanner(System.in);
    private Calculadora calc = new Calculadora();

    public void start(){
        int opcion;

        do {
            printMenu();
            //
            opcion = leerOpcion("Elige una opción: ");

            if (opcion >= 1 && opcion <= 4) {
                double n1 = leerNumero("Ingresa el primer numero: ");
                double n2 = leerNumero("Ingresa el segundo numero: ");
                procesarOperacion(opcion, n1, n2);
            } else if( opcion != 5){
                System.out.println("Opción invalida");
            }
        } while (opcion != 5);

        System.out.println("Hasta luego!");

    }

    private void procesarOperacion(int operacion, double n1, double n2){
        try {
            switch (operacion){
                case 1 -> System.out.println(n1 + " + " + n2 + " = " + calc.sumar(n1,n2));
                case 2 -> System.out.println(n1 + " + " + n2 + " = " + calc.restar(n1,n2));
                case 3 -> System.out.println(n1 + " + " + n2 + " = " + calc.multiplicar(n1,n2));
                case 4 -> System.out.println(n1 + " + " + n2 + " = " + calc.dividir(n1,n2));
            }
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private int leerOpcion(String mensaje){
        while (true) {
            System.out.print(mensaje);
            try{
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa una opción valida");
            }
        }
    }

    private double leerNumero(String mensaje){
        while (true) {
            System.out.print(mensaje);
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e){
                System.out.println("Error: Ingresa un numero valido");
            }
        }
    }

    public void printMenu(){
        System.out.println("----- CALCULADORA -----");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicar");
        System.out.println("4. Division");
        System.out.println("5. Salir");
    }



}
