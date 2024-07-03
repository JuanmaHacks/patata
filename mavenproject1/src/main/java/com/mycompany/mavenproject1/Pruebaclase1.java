/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author Mañanas
 */
public class Pruebaclase1 {

    public static void main(String[] args) {
        
//Declaración de variables
int numero1 = 10;
double numero2 =  5.5;
String nombre = "Juan Palomo";

//Operaciones matemáticas
        //suma del resultado numero1 y numero2
        double resultadosuma = numero1 + numero2;
        //resta del resultado numero1 y numero2
        double resultadoresta = numero1 - numero2;
        //multiplicacion del resultado numero1 y numero2
        double resultadomulti = numero1 * numero2;
        //division del resultado numero1 y numero2
        double resultadodivi = numero1 / numero2; 
        

        System.out.println("El resultado de la suma" + numero1 + " y " + numero2 + " es " + resultadosuma);
        System.out.println("El resultado de la resta " + numero1 + " y " + numero2 + " es " + resultadoresta);
        System.out.println("El resultado de la multiplicacion" + numero1 + " y " + numero2 + " es " +resultadomulti);
        System.out.println("El resultado de la division" + numero1 + " y " + numero2 + " es " + resultadodivi);
        
        //Concatenar variable numero2 numero con la cadena nombre
        System.out.println(nombre + ("tiene la edad de") + numero1);
        
        //Comprobaciones de con una estructura de control
        if (numero1 > numero2) System.out.println("numero1 es mayor que numero2");
        if (numero1 > numero2) System.out.println("numero1 es menor que numero2");
        if (numero1 > numero2) System.out.println("numero1 es igual que numero2");
        //Comprobaciones con una estructura de control
        
        if (numero1 > 5.5) {
              System.out.println("numero1 es mayor que 5.5");
          } else {
              System.out.println("num1 no es menor que 5.5");
          }

          if (numero1 < 5.5) {
              System.out.println("numero1 es menor que 5.5");
          } else {
              System.out.println("num1 no es mayor que 5.5");
          }
//Utilizando los operadores lógicos And y OR
          boolean llueve = true;
          boolean esFiesta = false;
          
          if (llueve || esFiesta) {
              System.out.println("no iré al trabajo hoy.");
          } else {
              System.out.println("Iré al trabajo hoy.");
                    
              boolean esMayorDeEdad = true;
              boolean tieneDocumento = true;
              
              if (esMayorDeEdad && tieneDocumento) {
                  System.out.println("La persona puede votar.");
              } else {
                  System.out.println("La persona no puede votar.");
              }
          }
     
        
        }
}