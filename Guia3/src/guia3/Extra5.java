package guia3;
import java.util.Scanner;
public class Extra5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int monto;
        String tipo;
        System.out.println("Ingrese el costo del tratamiento");
        monto = leer.nextInt();
        System.out.println("Ingrese el tipo de Socio (A,B,C)");
        tipo = leer.next();
        tipo = tipo.toUpperCase();
        
        switch (tipo){
            case "A":
                monto = monto * 50 / 100;
                System.out.println("El monto final es: "+monto);
                break;
            case "B":
                monto = monto * 65 / 100;
                System.out.println("El monto final es: "+monto);
                break;
            case "C":
                System.out.println("El monto final es: "+monto);
                break;
            default:
                System.out.println("TIPO DE SOCIO INCORRECTO"); 
            
                
        
        
        
        
        }
       
    }
}