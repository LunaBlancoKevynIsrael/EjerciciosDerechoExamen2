import java.util.Scanner;
public class Ejercicio17_Atletas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos atletas desea registrar? ");
        int n = sc.nextInt();
        String[] nombre = new String[n];
        String[] apellido = new String[n];
        String[] especialidad = new String[n];
        double[] tiempo = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre del atleta " + (i+1) + ": "); nombre[i] = sc.next();
            System.out.print("Apellido: "); apellido[i] = sc.next();
            System.out.print("Especialidad (ej. 100m): "); especialidad[i] = sc.next();
            System.out.print("Tiempo registrado (segundos): "); tiempo[i] = sc.nextDouble();
        }
        int idxMejor = 0;
        for (int i = 1; i < n; i++) if (tiempo[i] < tiempo[idxMejor]) idxMejor = i;
        System.out.println("\nRegistro de atletas:"); 
        System.out.println("Nombre\tApellido\tEspecialidad\tTiempo (s)"); 
        for (int i = 0; i < n; i++) {
            String fila = nombre[i] + "\t" + apellido[i] + "\t" + especialidad[i] + "\t" + tiempo[i];
            if (i == idxMejor) fila += " <-- Mejor tiempo";
            System.out.println(fila);
        }
        System.out.println("\nMejor tiempo: " + nombre[idxMejor] + " " + apellido[idxMejor] + " con " + tiempo[idxMejor] + "s");
        sc.close();
    }
}
