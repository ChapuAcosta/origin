package guia4;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int edad;
        String nombre,opc;

        do {
            System.out.println("Ingrese el nombre:");
            nombre = leer.next();
            System.out.println("Ingrese la edad");
            edad = leer.nextInt();
            mayoresValida(nombre, edad);
            System.out.println("Desea continuar? (Si/No)");
            opc = leer.next();
            opc = opc.toLowerCase();
        } while (!"no".equals(opc));
    }
    
    public static void mayoresValida(String a, int b) {
        if (b>=18){
            System.out.println(a+" ES MAYOR DE EDAD");
        } else {
            System.out.println(a+" NO ES MAYOR DE EDAD.");
        }
    }
}
      
       
