package org.example;

public class Main {
    public static void main(String[] args) {

        int num = 3;
        System.out.println("El factorial de "+num+" es: "+factorial(num));

    }

    public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}