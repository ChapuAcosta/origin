package guia3;
import java.util.Scanner;
public class Extra8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num,k,par,imp;
        k = 0;
        par = 0;
        imp = 0;
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            
            if (num%2==0){
                par = par + 1;
            } else {
                imp = imp + 1;
            }
            k = k + 1;
        } while (num%5!=0);
        System.out.println("USTED INGRESO "+k+" NÚMEROS");
        System.out.println("CANTIDAD DE NÚMEROS PARES:"+par);
        System.out.println("CANTIDAD DE NÚMEROS IMPARES:"+imp);
    }
}