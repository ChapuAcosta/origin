package guia4;
import java.util.Scanner;
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        double euros;
        String cambio;
        
            System.out.println("Ingrese la cantidad de euros:");
            euros = leer.nextInt();
            System.out.println("Ingrese la moneda solicitada");
            System.out.println("A - LIBRAS");
            System.out.println("B - DÓLAR");
            System.out.println("C - YENES");
            cambio = leer.next();
            cambio = cambio.toLowerCase();
            cambiarMoneda(euros, cambio);
    }
    
    public static void cambiarMoneda(double a, String b) {
        
        switch (b) {
            case "a":
                a = a * 0.86;
                System.out.println("El cambio de divisas es ₤"+a);
                break;
            case "b":
                a = a * 1.28611;
                System.out.println("El cambio de divisas es U$D "+a);
                break;
            case "c":
                a = a * 129.852;
                System.out.println("El cambio de divisas es ¥"+a);
                break;
            default:
                System.out.println("OPCIÓN INCORRECTA");
        } 
    }
}
      
       
