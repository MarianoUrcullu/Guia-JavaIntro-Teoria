/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package guia.javaintro.teoria.ejericio12;

import java.util.Scanner;

public class Ejericio12 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un segundo numero");
        int num2 = leer.nextInt();
        
        EsMultiplo(num1, num2);
        
    }
    public static void EsMultiplo(int num1,int num2){
        if (num2%num1 == 0) {
            System.out.println("Es multiplo");
        } else {
            System.out.println("No es multiplo");
        }
    }
}
