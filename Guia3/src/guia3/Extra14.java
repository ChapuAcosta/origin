package guia3;
import java.util.Scanner;
public class Extra14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n,m,i,sumaH,prom;
        
        System.out.println("Ingrese la cantidad de familias");
        n = leer.nextInt();

        sumaH = 0;
        for (i=1;i<=n;i++) {
            System.out.println("Ingrese la cantidad de hijos de la familia nro. "+i);
            m = leer.nextInt();
            sumaH = sumaH + m;
        }
        prom = sumaH / n;
        System.out.println("PROMEDIO DE HIJOS POR FAMILIA: "+prom);
    }
}