package guia5;
import java.util.Scanner;
public class Extra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        n = 5;
        int[] vector = new int [n];
        int[] vector2 = new int [n];

        System.out.println("PRIMER VECTOR");
        for (int i=0;i<vector.length;i++){
            System.out.println("Ingrese el elemento nro. "+ (i+1));
            vector[i] = leer.nextInt();
        }
        for (int elemento: vector){
            System.out.print("["+elemento+"]");
        }
        System.out.println();
        System.out.println("SEGUNDO VECTOR");
        for (int i=0;i<vector2.length;i++){
            System.out.println("Ingrese el elemento nro. "+ (i+1));
            vector2[i] = leer.nextInt();
            if (vector2[i]!=vector[i]){
                break;
            }
        }
        for (int elemento: vector2){
            System.out.print("["+elemento+"]");
        }
    }   
}
