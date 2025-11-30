import java.util.Scanner;
public class Ejercicio15_TemperaturasPaises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] paises = new String[4];
        double[][] temps = new double[4][3];
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese nombre del país " + (i+1) + ": ");
            paises[i] = sc.next();
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese temperatura media del mes " + (j+1) + " para " + paises[i] + ": ");
                temps[i][j] = sc.nextDouble();
            }
        }
        System.out.println("Paises y temperaturas ingresadas:");
        for (int i = 0; i < 4; i++) {
            System.out.print(paises[i] + ": ");
            for (int j = 0; j < 3; j++) System.out.print(temps[i][j] + " ");
            System.out.println();
        }
        double[] medias = new double[4];
        for (int i = 0; i < 4; i++) {
            double s = 0;
            for (int j = 0; j < 3; j++) s += temps[i][j];
            medias[i] = s / 3.0;
        }
        int idxMax = 0;
        for (int i = 1; i < 4; i++) if (medias[i] > medias[idxMax]) idxMax = i;
        System.out.println("Temperatura media trimestral por país:");
        for (int i = 0; i < 4; i++) {
            System.out.println(paises[i] + ": " + String.format("%.2f", medias[i]));
        }
        System.out.println("País con mayor temperatura media trimestral: " + paises[idxMax] + " (" + String.format("%.2f", medias[idxMax]) + ")");
        sc.close();
    }
}
