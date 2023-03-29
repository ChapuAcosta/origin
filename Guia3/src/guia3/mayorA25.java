package guia3;
import java.util.Scanner;
public class mayorA25 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1; int num2;
        System.out.println("Ingrese el primer número");
        num1 = leer.nextInt();
        System.out.println("Ingrese el segundo número");
        num2 = leer.nextInt();
        
        if (num1>25 && num2>25){
        System.out.println("Ambos números son mayores a 25");
    } else if (num1>25&&num2<=25){
        System.out.println("El primer número es mayor a 25");
    } else if (num1<=25&&num2>25){
        System.out.println("El segundo número es mayor a 25");
    } else {
        System.out.println("Ninguno de los números es mayor a 25");
    }
    }
}
