package guia3;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String cad1;
        int longi;
        System.out.println("Ingrese una frase o palabra de 8 caracteres");
        cad1 = leer.next();
        longi = cad1.length();
        if (longi == 8){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}