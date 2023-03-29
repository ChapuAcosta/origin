package guia5;
import java.util.Scanner;
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        boolean bar;
        System.out.println("Ingrese N");
        n = leer.nextInt();
        int[][] matriz = new int [n][n];
        int[][] matrizTrans = new int [n][n];
        
        
        //RELLENAR MATRICES
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.println("Ingrese el elemento ["+i+"]["+j+"] de la MATRIZ");
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("******************");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.println("Ingrese el elemento ["+i+"]["+j+"] de la MATRIZ TRANSPUESTA");
                matrizTrans[i][j] = leer.nextInt();
            }
        }
        
        //MOSTRAR MATRICES
        for (int[] fila: matriz){
            for (int elemento: fila){
                System.out.print("["+elemento+"]");
            }
            System.out.println();
        }
        System.out.println("***********");
        for (int[] fila: matrizTrans){
            for (int elemento: fila){
                System.out.print("["+elemento+"]");
            }
            System.out.println();
        }
        
        
        //COMPROBAR TRANSPUESTA
        bar = true;
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (matriz[i][j]==matrizTrans[j][i]){
                    bar = bar && true; 
                } else {
                    bar = bar && false; 
                }
            }
        }
        System.out.println("MATRIZ TRANSPUESTA: "+bar);
        
        //COMPROBAR SIGNOS
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                if (matriz[i][j]==-(matrizTrans[i][j])){
                    bar = bar && true; 
                } else {
                    bar = bar && false; 
                }
            }
        }
        System.out.println("MATRIZ ANTISIMÉTRICA: "+bar);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
    }
}
