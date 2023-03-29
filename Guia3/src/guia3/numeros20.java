package guia3;
import java.util.Scanner;
public class numeros20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num, i, suma;
        i = 0;
        suma = 0;
        do {
            System.out.println("Ingrese el primer número (" + i + ")");
            num = leer.nextInt();
            if (num>0){
                suma = suma + num;
                System.out.println("La suma de los números es " + suma);
            } else {
                System.out.println("La suma de los números es " + suma);
            }
            if (num == 0){
                System.out.println("Se capturo el número 0");
                break;
            }
            i = i + 1;
        } while (i < 20 && num != 0);
    }
}