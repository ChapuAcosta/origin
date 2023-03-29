package guia3;
import java.util.Scanner;
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n1, n2, opcion;
        String conf;
        System.out.println("Ingrese el primer valor");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo valor");
        n2 = leer.nextInt();
       
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");
            opcion = leer.nextInt();
            
            conf = "n";
             
            switch (opcion){
                case 1:
                    System.out.println(n1+" + " +n2+" = "+(n1+n2) );
                    break;
                case 2:
                    System.out.println(n1+" - " +n2+" = "+(n1-n2) );
                    break;
                case 3:
                    System.out.println(n1+" * " +n2+" = "+(n1*n2) );
                    break;
                case 4:
                    System.out.println(n1+" / " +n2+" = "+(n1/n2) );
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    conf = leer.next();
                    conf = conf.toLowerCase();
                    if (conf.equals("s")){
                        break;
                    }        
            } 
        } while (conf.equals("n"));
    }
}