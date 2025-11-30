import java.util.Scanner;
public class Ejercicio11_BuscarEnVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese número " + (i+1) + ": ");
            nums[i] = sc.nextInt();
        }
        System.out.print("Ingrese número a buscar: ");
        int x = sc.nextInt();
        boolean existe = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) { existe = true; break; }
        }
        if (existe) System.out.println("El número " + x + " existe en el arreglo.");
        else System.out.println("El número " + x + " NO existe en el arreglo.");
    }
}
