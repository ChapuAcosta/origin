package guia3;
import java.util.Scanner;
public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        String cad1, FDE;
        int cCor, cInc;
        
        FDE = "&&&&&";
        cCor = 0;
        cInc = 0;
        
        do {
            System.out.println("Ingrese una cadena");
            cad1 = leer.next();
            if (cad1.equals(FDE)){
                break;
            } else if (cad1.length()!=5 && cad1.substring(0,1)!="X" && cad1.substring(4)!="O"){
                cInc = cInc + 1;
                System.out.println("CADENAS INCORRECTAS: " + cInc);
            } else {
                cCor = cCor + 1;
                System.out.println("CADENAS CORRECTAS: " + cCor);
            }
        } while (cad1 != FDE);
        System.out.println("CADENAS CORRECTAS TOTALES: " + cCor);
        System.out.println("CADENAS INCORRECTAS TOTALES: " + cInc);
    }
}