import java.util.Scanner;
public class Ejercicio16_TiendaRopa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] tabla = new String[3][3]; // 3 artículos x 3 columnas (Artículo, Talla, Color)
        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese nombre del artículo " + (i+1) + " (ej. Camisa): ");
            tabla[i][0] = sc.next();
            System.out.print("Ingrese talla: ");
            tabla[i][1] = sc.next();
            System.out.print("Ingrese color: ");
            tabla[i][2] = sc.next();
        }
        System.out.println("\nTabla de artículos:");
        System.out.println("Artículo\tTalla\tColor");
        for (int i = 0; i < 3; i++) {
            System.out.println(tabla[i][0] + "\t" + tabla[i][1] + "\t" + tabla[i][2]);
        }
        sc.close();
    }
}
