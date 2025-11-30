import java.util.Scanner;
public class Ejercicio03_CajeroEnergia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double adeudo = 1000.00;
        boolean continuar = true;
        while (continuar) {
            System.out.println("--- Cajero Servicio de Energía ---");
            System.out.println("1. Consulta"); 
            System.out.println("2. Pago del mes"); 
            System.out.println("3. Pago de adeudo"); 
            System.out.println("4. Salir");
            System.out.print("Elige una opción (1-4): ");
            int op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Consulta: Su adeudo actual es: $" + String.format("%.2f", adeudo));
                    break;
                case 2:
                    System.out.println("Pago del mes: Su adeudo actual es: $" + String.format("%.2f", adeudo));
                    System.out.print("Ingrese monto a pagar: $");
                    double pagoMes = sc.nextDouble();
                    adeudo -= pagoMes;
                    System.out.println("Pago registrado. Adeudo actual: $" + String.format("%.2f", adeudo));
                    break;
                case 3:
                    System.out.println("Pago de adeudo. Adeudo pendiente: $" + String.format("%.2f", adeudo));
                    System.out.print("Ingrese monto a pagar: $");
                    double pago = sc.nextDouble();
                    adeudo -= pago;
                    System.out.println("Pago registrado. Adeudo actual: $" + String.format("%.2f", adeudo));
                    break;
                case 4:
                    System.out.println("Saliendo. ¡Gracias por su preferencia!");
                    continuar = false;
                    continue;
                default:
                    System.out.println("Opción inválida.");
            }
            if (continuar) {
                System.out.print("¿Desea realizar otra operación? (s/n): ");
                String resp = sc.next();
                if (!resp.equalsIgnoreCase("s")) {
                    System.out.println("Gracias. ¡Hasta luego!"); 
                    continuar = false;
                }
            }
        }
    }
}
