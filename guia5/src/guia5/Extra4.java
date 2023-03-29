package guia5;
import java.util.Scanner;
public class Extra4 {

    public static void main(String[] args) {
        
        int[] notas = new int [10];

        notas = rellenar(notas);
        aprobados(notas);
        imprimir(notas);
    }   
    
    public static int[] rellenar(int[] a) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int prom,n;
        for (int i=0;i<10;i++){
            System.out.println("ALUMNO NRO. "+(i+1));
            System.out.println("NOTA PRIMER TP:");
            n = leer.nextInt();
            suma += n;
            System.out.println("NOTA SEGUNDO TP:");
            n = leer.nextInt();
            suma += n;
            System.out.println("NOTA PRIMER INTEGRADOR:");
            n = leer.nextInt();
            suma += n;
            System.out.println("NOTA SEGUNDO INTEGRADOR:");
            n = leer.nextInt();
            suma += n;
            prom = suma/4;
            System.out.println("EL PROMEDIO DEL ALUMNO NRO "+(i+1)+" ES "+prom);
            a[i]=prom;
        }
        return a; 
    }
            

      
    
    public static void aprobados(int[] a) {
        int des,apro;
        des = 0;
        apro = 0;
        for (int elemento: a){
            if (elemento<7){
                des += 1;
            } else {
                apro += 1;
            }
        }
        System.out.println("APROBADOS: "+apro);
        System.out.println("DESAPROBADOS: "+des);
    }
}
