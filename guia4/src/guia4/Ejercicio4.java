package guia4;
import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num;
        boolean valida;
        
            System.out.println("Ingrese un número:");
            num = leer.nextInt();
            valida = validaPrimo(num);
            if (valida){
                System.out.println("EL NÚMERO "+num+" ES PRIMO.");
            } else {
                System.out.println("EL NÚMERO "+num+" NO ES PRIMO.");
            }
    }
    
    
    
    
    
    
    public static boolean validaPrimo(int a) {
        boolean val;
        int i,k;
        k = 0;
        val = false;
        for (i=1;i<=a;i++){
            if (a%i==0){
                k = k + 1;
            }
        }
        if (k==2){
            val = true;
        }
    return val;
    }
}
      
       
