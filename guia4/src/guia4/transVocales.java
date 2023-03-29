package guia4;
import java.util.Scanner;
public class transVocales {

    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
            String cad,ing,retorno;
            cad = "";
            do {
                System.out.println("Ingrese un carácter (Para finalizar, ingrese un punto)");
                ing = leer.next();
                retorno = transformar(ing);
                cad = cad + retorno;
            } while (!".".equals(ing));
            System.out.println(cad);
    }
    
    public static String transformar(String ing) {
        String car;
        switch (ing){
            case "a":
                car = "@";
                break;
            case "e":
                car = "#";
                break;
            case "i":
                car = "$";
                break;
            case "o":
                car = "%";
                break;
            case "u":
                car = "*";
                break;
            default:
                car = ing;
            }
    	return car;
	}
}

