package guia4;
import java.util.Scanner;
public class multiplosDos {

    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            int num1,num2;
            System.out.println("Ingrese el primer número");
            num1 = leer.nextInt();
            System.out.println("Ingrese el segundo número");
            num2 = leer.nextInt();
            esMultiplo(num1,num2);
    }
    
    public static void esMultiplo(int a, int b) {
        if (a%b==0){
            System.out.println(a+" ES MÚLTIPLO DE "+b);
        } else {
            System.out.println(a+" NO ES MÚLTIPLO DE "+b);
               }
	}
}