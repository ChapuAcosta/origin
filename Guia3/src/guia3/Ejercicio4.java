package guia3;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String cad1, cad2, cad3;
        System.out.println("Ingrese una frase o palabra");
        cad1 = leer.next();
        cad2 = cad1.substring(0,1);
        cad3 = "a";
        
        if (cad2.equals(cad3)){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}