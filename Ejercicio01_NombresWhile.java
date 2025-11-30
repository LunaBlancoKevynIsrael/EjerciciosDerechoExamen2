import java.util.*;
public class Ejercicio01_NombresWhile {
    public static void main(String[] args) {
        String[] nombres = {"Ana Perez","Luis Gomez","María López","Jorge Ruiz","Carla Díaz","Pedro Sánchez","Lucía Morales","David Hernández","Patricia Torres","Marco Alan"};
        int i = 0;
        while (i < nombres.length) {
            System.out.println((i+1) + ". " + nombres[i]);
            i++;
        }
    }
}
