package guia3;
import java.util.Scanner;
public class Extra7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int N,i,num,min,max,suma;
        System.out.println("Ingrese N");
        N = leer.nextInt();
        i = 0;
        min = 0;
        max = 0;
        do {
            System.out.println("Ingrese un número (n>0)");
            num = leer.nextInt();
            if (i==0){
                min = num;
                max = num;
            }
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
            i = i + 1;
        } while (i<N);
        
        /*while (i<N){
            System.out.println("Ingrese un número (n>0)");
            num = leer.nextInt();
            if (i==0){
                min = num;
                max = num;
            }
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
            i = i + 1;
        }*/
        System.out.println("MÁXIMO:"+max);
        System.out.println("MÍNIMO:"+min);
    }
}