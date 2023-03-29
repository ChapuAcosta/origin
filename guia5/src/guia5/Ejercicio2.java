package guia5;
import java.util.Scanner;
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n,num;
        n = 10;
        int[] vector = new int [n];
        System.out.println("Ingrese el número a buscar");
        num = leer.nextInt();
        //LLENA VECTOR
        for (int i=0;i<vector.length;i++){
            vector[i]=(int)(Math.random()*10+1); 
            System.out.print("["+vector[i]+"]");
        }
        System.out.println();
        //BUSCAR ELEMENTO EN EL VECTOR
        for (int i=0;i<vector.length;i++){
            if (num==vector[i]){
                System.out.println("El número se encuentra en la posición "+i);
            }   
        }       
    }
}
