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

        //devuelve el indice dentro de la cadena
        //de la primera aparicion de la cadena a buscar
        int indice = nuevo.indexOf("mar");
        System.out.println("Indice: " + indice);

        indice = nuevo.indexOf("ran", 10);
        System.out.println("Indice: " + indice);

        //metodos equals y equalsIgnoreCase
        System.out.println("Igualdad Java y java: " + "Java".equals("java"));
        System.out.println("Igualdad Java y java: " + "Java".equalsIgnoreCase("java"));

        //comparacion de cadenas (diccionario). Método compareTo()
        //devuelve cero si las cadenas son iguales,
        //un negativo si s1 esta antes que s2 en el diccionario (menor)
        //o un positivo si s1 esta despues que s2 (mayor)
        int compareTo = s1.compareTo(s1);
        System.out.println("Comparacion de s1 y s1: " + compareTo);
        compareTo = s1.compareTo("aes");
        System.out.println("Comparacion de s1 y aes: " + compareTo);
        compareTo = "aes".compareTo(s1);
        System.out.println("Comparacion de aes y s1: " + compareTo);

        //conversion mayusculas y minusculas
        String mayusculas = s2.toUpperCase();
        System.out.println("s2 en mayus: " + s2.toUpperCase());
        System.out.println("String mayusculas en minuscula: " + mayusculas.toLowerCase());

        //quitar espacios delante y detras
        String espacios = " palabra palabra ";
        System.out.println("Tamaño de espacios: " + espacios.length());
        String sinEspacios = espacios.trim();
        System.out.println("Tamaño de sinEspacios: " + sinEspacios.length());

        //reemplazo de caracteres
        System.out.println("String original: " + s2);
        String str2 = s2.replace('a', 'x');
        System.out.println("String reemplazado: " + str2);

        //contenido
        String aBuscar = "dealbor";
        System.out.println("¿Contiene " + s2 + " la subcadena " + aBuscar + "? "
                + s2.contains(aBuscar));

        //probar métodos endsWith, startsWith, isEmpty
        String Str = "Prueba de fe";       
        
        //comprueba la ultima palabra
        System.out.println("El valor de endsWith que devuelve es = " + Str.endsWith("fe"));

        System.out.println("El valor de endsWith que devuelve es = " + Str.endsWith("Fe"));
        
        //comprueba la primera palabra
        System.out.println("El valor de startsWith que devuelve es = " + Str.startsWith("Prueba"));

        System.out.println("El valor de startsWith que devuelve es = " + Str.startsWith("prue"));
        
        //comprueba si esta vacio
        Str = "";
        System.out.println("El valor de Str es = " + Str.isEmpty());
        
        Str = "prueba";
        System.out.println("El valor de Str es = " + Str.isEmpty());

        //obtener un array de char de la cadena
        //declaracion de una variable array de tipo char
        char[] arrayChar;
        arrayChar = s2.toCharArray();

        //el atributo length existe en todos los arrays y
        //me indica su tamaño. Equivalente al método length()
        // de los String
        for (int i = 0; i < arrayChar.length; i++) {
            //para acceder a cada posicion de los array uso
            //los corchetes
            System.out.println("Posicion i = " + i + " contenido = "
                    + arrayChar[i]);
        }

    }

}
