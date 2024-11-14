import java.util.Scanner;

public class Eliminar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        int[] array = {10, 20, 30, 40, 50};
        

        System.out.println("Array original:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int index;
        while (true) {
            System.out.print("Introduce el índice del elemento a mover al final: ");
            index = scanner.nextInt();
            
            if (index >= 0 && index < array.length) {
                break;
            } else {
                System.out.println("Índice no válido. Inténtalo de nuevo.");
            }
        }
        

        int elemento = array[index];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = elemento;
        

        System.out.println("Array modificado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

