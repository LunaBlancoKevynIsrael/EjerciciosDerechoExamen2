public class Ejercicio05_PatronFor {
    public static void main(String[] args) {
        int filas = 6;
        for (int i = 1; i <= filas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*"); 
            }
            System.out.println();
        }
    }
}
