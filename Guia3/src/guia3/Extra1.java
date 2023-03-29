package guia3;
import java.util.Scanner;
public class Extra1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int m, d, h;
        System.out.println("Ingrese el tiempo en minutos");
        m = leer.nextInt();
        
        h = m / 60;
        d = h / 24;
        do {
            h = h - 24;
        } while (h>=24);
        System.out.println("DÍAS: "+d);
        System.out.println("HORAS: "+h);
    }
}