import java.util.Scanner;
public class Ejercicio10_InvertirVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese número " + (i+1) + ": ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Números en orden inverso:");
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.println(nums[i]);
        }
        sc.close();
    }
}
