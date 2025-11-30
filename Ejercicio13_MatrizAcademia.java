import java.util.Scanner;
public class Ejercicio13_MatrizAcademia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int niveles = 3; // 0: básico,1: medio,2: perfeccionamiento
        int idiomas = 4; // 0: Inglés,1: Francés,2: Alemán,3: Ruso
        int[][] mat = new int[niveles][idiomas];
        System.out.println("Ingrese, para 12 alumnos, el nivel (0=Basico,1=Medio,2=Perfeccionamiento) y el idioma (0=Inglés,1=Francés,2=Alemán,3=Ruso):");
        for (int i = 1; i <= 12; i++) {
            System.out.print("Alumno " + i + " - Nivel: "); int n = sc.nextInt();
            System.out.print("Alumno " + i + " - Idioma: "); int id = sc.nextInt();
            if (n >=0 && n < niveles && id >=0 && id < idiomas) {
                mat[n][id]++;
            } else {
                System.out.println("Entrada inválida, se omite este registro."); 
            }
        }
        System.out.println("Matriz resultante (filas: niveles, columnas: idiomas):");
        for (int i = 0; i < niveles; i++) {
            for (int j = 0; j < idiomas; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
