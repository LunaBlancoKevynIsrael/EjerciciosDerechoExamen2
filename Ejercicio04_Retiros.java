import java.util.Scanner;
public class Ejercicio04_Retiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 5000.00;
        boolean seguir = true;
        while (seguir) {
            System.out.println("Saldo disponible: $" + String.format("%.2f", saldo));
            System.out.print("Ingrese monto a retirar: $");
            double retiro = sc.nextDouble();
            if (retiro <= saldo) {
                saldo -= retiro;
                System.out.println("Retiro exitoso. Saldo actual: $" + String.format("%.2f", saldo));
            } else {
                System.out.println("Saldo insuficiente.");
            }
            System.out.print("¿Desea realizar otro retiro? (s/n): ");
            String r = sc.next();
            if (!r.equalsIgnoreCase("s")) {
                seguir = false;
                System.out.println("Operación finalizada. Gracias.");
            }
        }
    }
}
