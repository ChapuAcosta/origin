package guia3;
import java.util.Scanner;
public class Extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n;
        System.out.println("Ingrese un número del 1 al 10");
        n = leer.nextInt();
        switch (n){
            case 1:
                System.out.println(n + " - I");
                break;
            case 2:
                System.out.println(n + " - II");
                break;
            case 3:
                System.out.println(n + " - III");
                break;
            case 4:
                System.out.println(n + " - IV");
                break;
            case 5:
                System.out.println(n + " - V");
                break;
            case 6:
                System.out.println(n + " - VI");
                break;
            case 7:
                System.out.println(n + " - VII");
                break;
            case 8:
                System.out.println(n + " - VIII");
                break;
            case 9:
                System.out.println(n + " - IX");
                break;
            case 10:
                System.out.println(n + " - X");
                break;
            default:
                System.out.println("ERA DEL 1 AL 10");
        
        
        
        
        
        }
    }
}