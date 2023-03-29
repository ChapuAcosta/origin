package guia3;
import java.util.Scanner;
public class validarNota {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int nota;
        
        nota = 0;
        while (nota<1||nota>10) {
            System.out.println("Indique una nota del 1 al 10");
            nota = leer.nextInt();
        }
        System.out.println("La nota es correcta");     
    }
}
