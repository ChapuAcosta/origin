package guia3;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String cad1, cad2;
        cad1 = "eureka";
        System.out.println("Ingrese una palabra");
        cad2 = leer.next();
        
        if (cad1.equals(cad2)){
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}
