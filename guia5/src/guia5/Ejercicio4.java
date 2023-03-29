package guia5;
public class Ejercicio4 {

    public static void main(String[] args) {
        int[][] matriz = new int [4][4];
        int[][] matrizTrans = new int [4][4];
        
        //RELLENAR MATRIZ
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                matriz[i][j]= (int) (Math.random()*10+1);
            }
        }
        for (int i=0;i<matriz.length;i++){
            for (int j=0;j<matriz.length;j++){
                matrizTrans[j][i]= matriz[i][j];
            }
        }
        
        
        
        
        
        
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
       
    }
}
