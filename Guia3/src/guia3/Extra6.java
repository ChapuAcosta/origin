package guia3;
import java.util.Scanner;
public class Extra6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int N, alt, sumaAlt, sumaAlt160, prom, prom160, i, k;
        System.out.println("Ingrese N");
        N = leer.nextInt();
        k = 0;
        sumaAlt = 0;
        sumaAlt160 = 0;
        for (i=0;i<N;i++){
            System.out.println("Ingrese la altura en CENTÍMETROS:");
            alt = leer.nextInt();
            sumaAlt = sumaAlt + alt;
            if (alt<160){
                sumaAlt160 = sumaAlt160 + alt;
                k = k + 1;
            }
        }
        prom = sumaAlt / N;
        prom160 = sumaAlt160 / k;
        System.out.println("PROMEDIO DE ALTURA MENOR A 160CM:"+prom160);
        System.out.println("PROMEDIO DE ALTURA GENERAL:"+prom);
    }
}