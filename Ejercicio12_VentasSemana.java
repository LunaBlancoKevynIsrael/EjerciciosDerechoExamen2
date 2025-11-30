import java.util.Scanner;
public class Ejercicio12_VentasSemana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ventas = new double[7];
        double total = 0;
        for (int i = 0; i < 7; i++) {
            System.out.print("Ingrese venta del día " + (i+1) + ": $");
            ventas[i] = sc.nextDouble();
            total += ventas[i];
        }
        int diaMayor = 0;
        for (int i = 1; i < ventas.length; i++) {
            if (ventas[i] > ventas[diaMayor]) diaMayor = i;
        }
        System.out.println("Venta total de la semana: $" + String.format("%.2f", total));
        System.out.println("Día con mayor venta: Día " + (diaMayor+1) + " con $" + String.format("%.2f", ventas[diaMayor]));
    }
}
