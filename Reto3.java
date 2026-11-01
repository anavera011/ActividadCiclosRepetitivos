import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double sumaEdades = 0; 

        // El ciclo se repite exactamente 3 veces (para los 3 animales)
        for (int i = 1; i <= 3; i++) {
            System.out.print("Ingrese la edad del animal " + i + ": ");
            int edad = teclado.nextInt();
            
            // Vamos acumulando las edades
            sumaEdades += edad; 
        }

        // Calculamos el promedio dividiendo la suma total entre 3
        double promedio = sumaEdades / 3;

        System.out.println("La edad promedio de los animales es: " + promedio + " años.");
        teclado.close();
    }
}
