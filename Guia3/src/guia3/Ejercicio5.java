package guia3;
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n, i, num, suma;
        System.out.println("Ingrese un valor");
        n = leer.nextInt();
        suma = 0;
        while (suma <= n){
            System.out.println("Ingrese un número:");
            num = leer.nextInt();
            suma = suma + num;
            System.out.println("La suma total es: " + suma);
        }
        System.out.println("Has superado el límite original de " + n + "!");
    }
}