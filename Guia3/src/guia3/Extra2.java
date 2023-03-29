package guia3;
import java.util.Scanner;
public class Extra2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int a,b,c,d,aux;
        a = 5;
        b = 7;
        c = 9;
        d = 3;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
        System.out.println("--------------");
        aux = b;
        b = c;
        c = a;
        a = d;
        d = aux;
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
}