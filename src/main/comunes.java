public class comunes {
        public static String comunes(int[] a, int[] b) {
        String resultado = "";
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    resultado += a[i] + " ";
                    break;
                }
            }
        }
        return resultado.trim();
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};
        System.out.println(comunes(a, b));
    }
}




