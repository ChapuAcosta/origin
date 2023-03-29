package guia3;
import java.util.Scanner;
public class Extra13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n,i;
        String cad;
        
        System.out.println("Ingrese la altura de la escalera");
        n = leer.nextInt();
        cad = "";
        for (i=1;i<=n;i++) { 
            cad = cad + String.valueOf(i);
            System.out.println(cad);
        }
    }
}