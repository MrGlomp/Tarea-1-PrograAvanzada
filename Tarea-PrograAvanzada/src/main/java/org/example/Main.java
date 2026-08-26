package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Ingrese el un numero: ");
        num = sc.nextInt();
        long tiempoInicio = System.nanoTime();
        System.out.println("El factorial de "+num+" es: "+factorialRecursivo(num));
        long tiempoFin = System.nanoTime();
        double duracionSegundos = (tiempoFin - tiempoInicio) / 1_000_000_000.0;
        System.out.println("Tiempo demorado: "+duracionSegundos+" segundos");

    }

    public static BigInteger factorial(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("El numero debe ser positivo");
        }

        BigInteger resultado = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            resultado = resultado.multiply(BigInteger.valueOf(i));
        }
        return resultado;
    }

    public static BigInteger factorialRecursivo(int n) {

        if (n < 0) {
            throw new IllegalArgumentException("El numero debe ser positivo");
        }

        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorialRecursivo(n - 1));
    }
}