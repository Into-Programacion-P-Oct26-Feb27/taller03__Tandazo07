/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Ejercicio6 {
     public static void main(String[] args) {
        int a = 100;
        int b = 4;
        int c = 25;
        int base = 7;
        int exponente = 2;
        int limite = 50;

        double division = a / (double) b;
        double potencia = Math.pow(base, exponente);

        boolean condicion1 = division == c;
        boolean condicion2 = potencia > limite;
        boolean resultado = condicion1 && condicion2;

        System.out.println("100 / 4 = " + division);
        System.out.println("7^2 = " + potencia);
        System.out.println("Resultado: " + resultado);
    }
}

