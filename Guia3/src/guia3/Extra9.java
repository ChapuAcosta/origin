package guia3;
import java.util.Scanner;
public class Extra9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int D,d,i,c;
        System.out.println("Ingrese el número a dividir");
        D = leer.nextInt();
        System.out.println("Ingrese el número divisor");
        d = leer.nextInt();
        i = 0;
        do {
            c = D - d;
            D = c;
            i = i + 1;
        } while (c>=d);
        System.out.println("COCIENTE: "+i);
        System.out.println("RESTO: "+c);
        
    }
}