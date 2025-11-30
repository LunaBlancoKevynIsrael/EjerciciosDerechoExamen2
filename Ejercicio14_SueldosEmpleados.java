import java.util.Scanner;
public class Ejercicio14_SueldosEmpleados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] empleados = new String[4];
        double[][] sueldos = new double[4][3];
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese nombre del empleado " + (i+1) + ": ");
            empleados[i] = sc.next();
            for (int j = 0; j < 3; j++) {
                System.out.print("Ingrese sueldo mes " + (j+1) + " de " + empleados[i] + ": ");
                sueldos[i][j] = sc.nextDouble();
            }
        }
        double totalPagado = 0;
        double[] acumulados = new double[4];
        for (int i = 0; i < 4; i++) {
            double suma = 0;
            for (int j = 0; j < 3; j++) suma += sueldos[i][j];
            acumulados[i] = suma;
            totalPagado += suma;
        }
        int idxMax = 0;
        for (int i = 1; i < 4; i++) if (acumulados[i] > acumulados[idxMax]) idxMax = i;
        System.out.println("Ingreso acumulado por empleado:");
        for (int i = 0; i < 4; i++) {
            System.out.println(empleados[i] + ": $" + String.format("%.2f", acumulados[i]));
        }
        System.out.println("Total pagado a todos los empleados en los últimos 3 meses: $" + String.format("%.2f", totalPagado));
        System.out.println("Empleado con mayor ingreso acumulado: " + empleados[idxMax] + " con $" + String.format("%.2f", acumulados[idxMax]));
        sc.close();
    }
}
