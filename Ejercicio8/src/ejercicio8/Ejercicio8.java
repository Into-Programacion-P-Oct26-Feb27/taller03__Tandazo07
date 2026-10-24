/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author ASUS
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int a = 80;
        int b = 40;
        int c = 6;
        int base = 5;
        int exponente = 2;
        int limite1 = 45;
        int d = 100;
        int e = 25;
        int f = 3;
        int limite2 = 30;

        double parte1 = (a + b) / (double) c + Math.pow(base, exponente);
        int parte2 = d - e * f;

        boolean condicion1 = parte1 >= limite1;
        boolean condicion2 = parte2 < limite2;
        boolean resultadoBoolean = condicion1 && condicion2;

        int resultado = resultadoBoolean ? 1 : 0;

        System.out.println("(80 + 40) / 6 + 5^2 = " + parte1);
        System.out.println("100 - 25 * 3 = " + parte2);
        System.out.println("Resultado (1 = true, 0 = false): " + resultado);
    }
}
