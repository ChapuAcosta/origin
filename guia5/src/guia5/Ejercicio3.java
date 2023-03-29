package guia5;
public class Ejercicio3 {

    public static void main(String[] args) {
        int n = 5;
        int[] vector = new int [n];
        //LLENA VECTOR
        for (int i=0;i<vector.length;i++){
            vector[i]=(int)(Math.random()*100000+1); 
            System.out.print("["+vector[i]+"]");
        }
        System.out.println();
        
        //BUSCAR ELEMENTO EN EL VECTOR
        for (int elemento: vector){
            int c,d,k;
            k = 0;
            d = elemento;
            do {
                c = d/10;
                d = c;
                k += 1;
            } while (c>0);
            System.out.println("["+elemento+"] TIENE "+k+" DÍGITOS");
                    
              
        }       
    }
}
