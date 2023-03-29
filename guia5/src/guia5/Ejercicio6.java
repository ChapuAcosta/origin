package guia5;
import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        
        n = 3;
        
        int[][] matriz = new int [n][n];
        rellenarMatriz(matriz,n);
        imprimirMatriz(matriz,n);
        if (comprobarMatriz(matriz,n)){
            System.out.println("LA MATRIZ ES MÁGICA.");
        } else {
            System.out.println("LA MATRIZ NO ES MÁGICA");
        }
    }
    

        public static void rellenarMatriz(int[][] a,int b) {
            Scanner leer = new Scanner(System.in);
            int num;
            for (int i=0;i<b;i++){
                for (int j=0;j<b;j++){
                    do {
                    System.out.println("Ingrese el elemento ["+i+"]["+j+"] (del 1 al 10)");
                    num = leer.nextInt();
                    if (num>=1 && num <=10){
                        a[i][j] = num;
                    } else {
                        System.out.println("EL NÚMERO INGRESADO ES NO VÁLIDO");
                    }
                } while (num < 1 || num > 10);
                }
            }
        }
                
        public static void imprimirMatriz(int[][] a,int b) {
            for (int i=0;i<b;i++){
                for (int j=0;j<b;j++){
                    System.out.print("["+a[i][j]+"]");
                }
                System.out.println();
        }
    }
        
        public static boolean comprobarMatriz(int[][] a,int b) {
            boolean val,dia,col,fil;
            val = true;
            dia = diagonales(a,b);
            col = columnas(a,b);
            fil = filas(a,b);
            val = val && dia && col && fil;
            return val;
        }
        
        
        public static boolean diagonales(int[][] a,int b) {
            boolean val;
            int sumaD, sumaDI,i,j;
            val = false;
            sumaD = 0;
            sumaDI = 0;
            for (i=0;i<b;i++){
                for (j=0;j<b;j++){
                    if (i == j){
                        sumaD = sumaD + a[i][j];
                    }
                }
            }
            System.out.println(sumaD);
            for (i=b-1;i>=0;i--){
                for (j=b-1;j>=0;j--){
                    if (i == j){
                        sumaDI = sumaDI + a[i][j];
                    }
                }
            }
            System.out.println(sumaDI);
            if (sumaD == sumaDI){
                val = true;
            }
            System.out.println("DIAGONALES: "+val);
            return val;
        }
        
        
        public static boolean columnas(int[][] a,int b) {
            boolean val;
            int suma1,suma2,suma3,i,j,k;
            val = false;
            suma1 = 0;
            suma2 = 0;
            suma3 = 0;
            k = 0;
            for (i=0;i<b;i++){
                for (j=0;j<b;j++){
                    if (j==0){
                        suma1 = suma1 + a[k][j];
                    }
                    if (j==1){
                        suma2 = suma2 + a[k][j];
                    }
                    if (j==2){
                        suma3 = suma3 + a[k][j];
                    }
                }
                k += 1;
            }
            if (suma1 == suma2 && suma2 == suma3){
                val = true;
            }
            System.out.println("COLUMNAS: "+val);
            return val;
        }
        
        
        public static boolean filas(int[][] a,int b) {
            boolean val;
            int suma1,suma2,suma3,i,j,k;
            val = false;
            suma1 = 0;
            suma2 = 0;
            suma3 = 0;
            k = 0;
            for (i=0;i<b;i++){
                for (j=0;j<b;j++){
                    if (i==0){
                        suma1 = suma1 + a[k][j];
                    }
                    if (i==1){
                        suma2 = suma2 + a[k][j];
                    }
                    if (i==2){
                        suma3 = suma3 + a[k][j];
                    }
                }
                k += 1;
            }
            if (suma1 == suma2 && suma2 == suma3){
                val = true;
            }
            System.out.println("FILAS: "+val);
            return val;
        } 
}