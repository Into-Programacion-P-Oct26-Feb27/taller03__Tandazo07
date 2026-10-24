/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author ASUS
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int suma = 15 + 25;
double potencia = Math.pow(6, 2);
double raiz = Math.sqrt(144);

boolean resultadoBoolean = (suma > 30) || ((potencia < 60) && (raiz == 12));
int resultado = resultadoBoolean ? 1 : 0;

System.out.println("15 + 25 = " + suma);
System.out.println("6^2 = " + potencia);
System.out.println("Raiz de 144 = " + raiz);
System.out.println("Resultado (1 = true, 0 = false): " + resultado);
    
}}
