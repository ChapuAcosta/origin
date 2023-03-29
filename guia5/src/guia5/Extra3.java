package guia5;
public class Extra3 {

    public static void main(String[] args) {
        int n = 5;
        int[] vector = new int [n];

        vector = rellenar(vector);
        imprimir(vector);
    }   
    
    public static int[] rellenar(int[] a) {
        for (int i=0;i<a.length;i++){
            a[i] = (int)(Math.random()*10+1);
        }
    return a;
    }   
    
    public static void imprimir(int[] a) {
        for (int elemento: a){
            System.out.print("["+elemento+"]");
        }
        System.out.println();
    }
}
