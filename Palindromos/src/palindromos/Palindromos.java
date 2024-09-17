package palindromos;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Palindromos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       System.out.println("Por favor, introduce una palabra");
       String cadena = teclado.nextLine();
       if(esPalindromo(cadena)){
           System.out.println("Es un palindromo");
       }else{
           System.out.println("No es un palindromo");
       }
    }
    
    static boolean esPalindromo(String cadena){
        cadena =cadena.replace(" ","");
        cadena =cadena.toLowerCase();
        StringBuilder cadenaInvertida = new StringBuilder();
        
        for(int i= cadena.length()-1; i>=0; i--){
            cadenaInvertida.append(cadena.charAt(i));
        }
        return cadena.equals(cadenaInvertida.toString());
    }
}
