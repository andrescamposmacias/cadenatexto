/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasestring;

/**
 *
 * @author andres
 */
public class ClaseString {

    public static void main(String[] args) {

        String s = "iesmardealboran.com";

        //tamaño de la cadena
        System.out.println("Tamaño: " + s.length());

        //obtener el char de una posicion concreta
        System.out.println("Char de la posicion 5: " + s.charAt(5));

        //obtener subcadena desde el caracter i-esimo hasta el final
        //de la cadena
        String subcadena = s.substring(3);
        System.out.println("Subcadena = " + subcadena);

        //obtener subcadena desde el caracter i-esimo hasta el
        //caracter j-esimo de la cadena
        subcadena = s.substring(8, 15);
        System.out.println("Subcadena = " + subcadena);
        
        //concatenar cadenas, equivale al operador +
        String s1 = "ies";
        String s2 = "mardealboran.com";
        String nuevo = s1 + s2;
        String nuevo2 = s1.concat(s2);
        System.out.println("Nuevo: " + nuevo);
        System.out.println("Nuevo2: " + nuevo2);
    }

}