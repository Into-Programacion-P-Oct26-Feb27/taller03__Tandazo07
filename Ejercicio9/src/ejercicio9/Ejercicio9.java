/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author ASUS
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int raizDe = 225;
        int base = 5;
        int exponente = 2;
        int limite = 50;
        int a = 120;
        int b = 4;
        int esperado = 30;

        double parte1 = Math.sqrt(raizDe) + Math.pow(base, exponente);
        double parte2 = a / (double) b;

        boolean condicion1 = parte1 < limite;
        boolean condicion2 = parte2 == esperado;
        boolean resultadoBoolean = !(condicion1 && condicion2);

        int resultado = resultadoBoolean ? 1 : 0;

        System.out.println("√225 + 5^2 = " + parte1);
        System.out.println("120 / 4 = " + parte2);
        System.out.println("Resultado (1 = true, 0 = false): " + resultado);
    }
}
