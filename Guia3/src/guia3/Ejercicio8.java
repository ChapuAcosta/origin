package guia3;
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n, i, j;
        System.out.println("Ingrese un valor");
        n = leer.nextInt();
        
        for (i=1; i<n+1; i++){
            if (i==1 || i==n){
                for (j=1; j<n; j++){
                    System.out.print("*");
                }
            } else {
                for (j=1; j<n; j++){
                    if (j==1 || j==n){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("*");
        }
    }
}