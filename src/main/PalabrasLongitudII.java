import java.util.Scanner;

public class PalabrasLongitudII {
    public static boolean contarPalabrasLongitud(String texto, int num) {
        String[] palabras = texto.split("");

        for (String palabra : palabras) {
            if (palabra.length() == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el texto: ");
        String texto = scanner.nextLine();

        System.out.print("Introduce un numero: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        boolean resultado = contarPalabrasLongitud(texto, num);
        if (resultado) {
            System.out.println("Hay al menos una palabra con longitud " + num + ".");
        } else {
            System.out.println("No hay palabras con longitud " + num + ".");
        }
    }
}
