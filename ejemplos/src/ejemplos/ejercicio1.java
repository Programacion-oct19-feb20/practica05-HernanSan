/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *Un padre de familia a pagado 2 cuotas de navidad de su hijo la cuota1 fue de 
 15 la cuota dos de 10 y la cuota3 de 16 generar un programa en lenguaje java 
 * que permita ingresar por teclado los valores de las cuotas luego presentar 
 * el promedio de dolares pagados entre las cuotas a demas presentar un mensaje 
 * en pantalla (tru o false) dependiendo del preomedio si el promedio es mayor
 * o igual a 11 deberia saler tru si el promedio es menor a 11 deberia salir false
public class ejercicio1 
*/
public class ejercicio1 {
   public static void main(String[] args) {
    Scanner entrada = new Scanner (System.in);
    int cuota1;
    int cuota2;
    int cuota3;
    int promedio;
    
    
     System.out.println("Ingrese el valor de la cuota1");
     cuota1 = entrada.nextInt();
      System.out.println("Ingrese el valor de la cuota2");
     cuota2 = entrada.nextInt();
      System.out.println("Ingrese el valor de la cuota3");
     cuota3 = entrada.nextInt();
     
    promedio = (cuota1 + cuota2 + cuota3)/3;   
    
    System.out.printf("Promedio de las cuotas: %d\n" + "promedio es: %s\n", promedio,
            promedio>=11);
}
}