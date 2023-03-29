package guia3;
import java.util.Scanner;
public class Extra10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int num1,num2,num3,n;
        num1 = (int) (Math.random()*10);
        num2 = (int) (Math.random()*10);
        num3 = num1 * num2;
        do {
            System.out.println("ADIVINA EL NÚMERO DEL 1 AL 100");
            n = leer.nextInt();
            if (n!=num3){
                System.out.println("ESE NO ERA ;)");
            } else {
                System.out.println("CORRECTO");
            }
        } while (n != num3);
    }
}