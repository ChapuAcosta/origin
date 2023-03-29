package guia5;
import java.util.Scanner;
public class Extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,suma;
        n = 5;
        int[] vector = new int [n];
        //RELLENAR
        suma = 0;
        for (int i=0;i<vector.length;i++){
            System.out.println("Ingrese el elemento nro. "+ (i+1));
            vector[i] = leer.nextInt();
            suma += vector[i];
        }
        for (int elemento: vector){
            System.out.print("["+elemento+"]");
        }
        System.out.println();
        System.out.println("La suma de todos los elementos es "+suma);
    }
}
