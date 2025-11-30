public class Ejercicio02_ParesWhile {
    public static void main(String[] args) {
        int n = 1;
        System.out.println("Números pares entre 1 y 20:");
        while (n <= 20) {
            if (n % 2 == 0) {
                System.out.print(n + " ");
            }
            n++;
        }
        System.out.println();
    }
}
