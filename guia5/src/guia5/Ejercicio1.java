package guia5;
public class Ejercicio1 {

    public static void main(String[] args) {
        int[] vector = new int [100];
        for (int i=0;i<vector.length;i++){
             vector[i]=i;            
        }
        /*String aux = "";
        for (int elemento: vector){
             aux += "-"+elemento;
        }
        System.out.println(aux);*/
        for (int i=(vector.length)-1;i>=0;i--){
             System.out.print("["+vector[i]+"]");           
        }
    }
    
}
