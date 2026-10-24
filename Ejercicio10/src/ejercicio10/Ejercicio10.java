/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author ASUS
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int base1 = 4;
        int exp1 = 3;
        int raizDe = 81;
        int limite1 = 70;
        int a = 50;
        int b = 2;
        int esperado = 25;
        int c = 18;
        int d = 12;
        int limite2 = 25;
        int base2 = 7;
        int exp2 = 2;
        int limite3 = 40;

        double parte1 = Math.pow(base1, exp1) + Math.sqrt(raizDe);
        double parte2 = a / (double) b;
        int parte3 = c + d;
        double parte4 = Math.pow(base2, exp2);

        boolean cond1 = parte1 > limite1;
        boolean cond2 = parte2 == esperado;
        boolean cond3 = parte3 <= limite2;
        boolean cond4 = !(parte4 > limite3);

        boolean resultadoBoolean = (cond1 && cond2) || (cond3 && cond4);

        int resultado = resultadoBoolean ? 1 : 0;

        System.out.println("4^3 + √81 = " + parte1);
        System.out.println("50 / 2 = " + parte2);
        System.out.println("18 + 12 = " + parte3);
        System.out.println("7^2 = " + parte4);
        System.out.println("Resultado (1 = true, 0 = false): " + resultado);
    }
}
