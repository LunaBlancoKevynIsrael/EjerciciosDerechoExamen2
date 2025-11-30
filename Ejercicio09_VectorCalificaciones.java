import java.util.Scanner;
public class Ejercicio09_VectorCalificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] cal = new double[6];
        double suma = 0;
        for (int i = 0; i < 6; i++) {
            System.out.print("Ingrese calificación del alumno " + (i+1) + ": ");
            cal[i] = sc.nextDouble();
            suma += cal[i];
        }
        double promedio = suma / cal.length;
        System.out.println("Calificaciones ingresadas:");
        for (int i = 0; i < cal.length; i++) {
            System.out.println("Alumno " + (i+1) + ": " + cal[i]);
        }
        System.out.println("Promedio final del grupo: " + String.format("%.2f", promedio));
    }
}
