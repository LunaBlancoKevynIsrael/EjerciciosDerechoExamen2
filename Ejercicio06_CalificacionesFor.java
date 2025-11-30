import java.util.Scanner;
public class Ejercicio06_CalificacionesFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aprobados = 0, reprobados = 0;
        double suma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese calificación del alumno " + i + " (1-10): ");
            double cal = sc.nextDouble();
            suma += cal;
            if (cal >= 6.0) aprobados++; else reprobados++;
        }
        double promedio = suma / 5.0;
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Reprobados: " + reprobados);
        System.out.println("Promedio del grupo: " + String.format("%.2f", promedio));
    }
}
