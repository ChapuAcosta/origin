package guia3;
import java.util.Scanner;
public class Extra12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int i,j,k;
        
        for (i=0;i<10;i++) { 
            for (j=0;j<10;j++) {
                for (k=0;k<10;k++) {
                    if (i!=3) {
                        System.out.print(i + "-");
                    } else {
                        System.out.print("E-");
                    }
                    if (j!=3) {
                        System.out.print(j+"-");
                    } else {
                        System.out.print("E-");
                    }
                    if (k!=3) {
                        System.out.println(k);
                    } else {
                        System.out.println("E");
                    }
                }
            }
        }
    }
}