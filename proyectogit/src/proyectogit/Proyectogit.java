/*
 * Author : Pablo
Fecha: 4-2-20

 */
package proyectogit;

import java.text.DecimalFormat;

import java.util.Scanner;
public class Proyectogit {
static  Scanner keyboard = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //preguntar dni
        int dni = 12345678;
        char letter = DNIletter(dni);
        System.out.println(dni+":" + letter);
        dni = keyboard.nextInt();
        
        
    }
    
    private static char DNIletter(int dni){
        char letter='Z'; 
        String letters="TRWAGMYFPDXBNJZSQVHLCKE";
        int res=dni%23;
        letter = letters.charAt(res);
        return letter;
        
        
                }
}
    

