public class Ejercicio08_AhorroInteres {
    public static void main(String[] args) {
        double ahorroMensual = 500.0;
        double interesMensual = 0.09;
        double saldo = 0.0;
        System.out.println("Mes\tSaldo al final del mes");
        for (int mes = 1; mes <= 12; mes++) {
            saldo = (saldo + ahorroMensual) * (1 + interesMensual);
            System.out.println(mes + "\t$" + String.format("%.2f", saldo));
        }
        System.out.println("Total ahorrado al final del año: $" + String.format("%.2f", saldo));
    }
}
