import javax.swing.plaf.basic.BasicScrollPaneUI;

public class inverso {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] inversoArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            inversoArray[i] = originalArray[originalArray.length - 1 - i];
        }

        System.out.println("Array original:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Array inverso:");
        for (int num : inversoArray) {
            System.out.print(num + " ");
        }
    }
}


