package guia3;
import java.util.Scanner;
public class Extra11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num,i;
        System.out.println("Ingrese un número");
        num = leer.nextInt();
        i = 0;
        while (num > 0){
            num = num / 10;
            i = i + 1;
        }
        System.out.println("NÚMERO DE DÍGITOS: "+i);
    }
}