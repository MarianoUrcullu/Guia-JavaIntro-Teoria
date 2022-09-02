/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

Para realizar este ejemplo, deberás investigar el método concat de la
clase String. Puedes encontrar estos ejemplos al final de la guía.

a = @   e = #   i = $   o = %   u = °

 */
package guia.javaintro.teoria.ejercicio11;

import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese una frase");
        String frase = leer.next();

        System.out.println(codificacion(frase));

    }

    public static String codificacion(String frase) {

        String frasecodificada = "";
        frase = frase.toUpperCase();

        for (int i = 0; i < frase.length(); i++) {

            switch (frase.substring(i, i+1)) {
                case "A":
                    frasecodificada = frasecodificada.concat("@");
                    break;
                case "E":
                    frasecodificada = frasecodificada.concat("#");
                    break;
                case "I":
                    frasecodificada = frasecodificada.concat("$");
                    break;
                case "O":
                    frasecodificada = frasecodificada.concat("%");
                    break;
                case "U":
                    frasecodificada = frasecodificada.concat("°");
                    break;
                default:
                    frasecodificada = frasecodificada.concat(frase.substring(i,i+1));
                    break;
            }
            
        }

        return frasecodificada;
    }

}
