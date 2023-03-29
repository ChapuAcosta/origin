package guia3;
import java.util.Scanner;
public class asteriscos4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n1,n2,n3,n4;
        n1 = 0;
        n2 = 0;
        n3 = 0;
        n4 = 0;
        while (n1<1||n1>20) {
            System.out.println("Indique el primer número (1 al 20)");
            n1 = leer.nextInt();
        }
        while (n2<1||n2>20) {
            System.out.println("Indique el segundo número (1 al 20)");
            n2 = leer.nextInt();
        }
        while (n3<1||n3>20) {
            System.out.println("Indique el tercer número (1 al 20)");
            n3 = leer.nextInt();
        }
        while (n4<1||n4>20) {
            System.out.println("Indique el cuarto número (1 al 20)");
            n4 = leer.nextInt();
        }
        
        System.out.print(n1 + " ");
        for (int i=0;i<n1;i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print(n2 + " ");
        for (int i=0;i<n2;i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.print(n3 + " ");
        for (int i=0;i<n3;i++) {
            System.out.print("*");
        }     
        System.out.println();
        System.out.print(n4 + " ");
        for (int i=0;i<n4;i++) {
            System.out.print("*");
        }
    }
}
