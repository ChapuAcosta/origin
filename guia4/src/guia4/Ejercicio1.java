package guia4;
import java.util.Scanner;
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int n1, n2, opcion, resultado;
        String conf;
        System.out.println("Ingrese el primer valor");
        n1 = leer.nextInt();
        System.out.println("Ingrese el segundo valor");
        n2 = leer.nextInt();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("LOS NÚMEROS SON "+n1+" Y "+n2);
       
        do {
            System.out.println("¿Qué desea hacer?");
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
                    resultado = suma(n1,n2);
                    System.out.println(resultado);
                    break;
                case 2:
                    resultado = resta(n1,n2);
                    System.out.println(resultado);
                    break;
                case 3:
                    resultado = multi(n1,n2);
                    System.out.println(resultado);
                    break;
                case 4:
                    resultado = divi(n1,n2);
                    System.out.println(resultado);
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
    
        public static int suma(int a, int b) {
        int suma;
        suma = a + b;
        return suma;
	}
        
        public static int resta(int a, int b) {
        int resta;
        resta = a - b;
        return resta;
	}
        
        public static int multi(int a, int b) {
        int mult;
        mult = a * b;
        return mult;
	}
        
        public static int divi(int a, int b) {
        int divi;
        divi = a / b;
        return divi;
	}
}
