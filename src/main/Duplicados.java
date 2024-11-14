public class Duplicados {
    public static String duplicados(int[] nums) {
        String res = "";
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length ; j++) {
                if (nums[i] == nums[j]){
                    res += nums[i] + " ";
                }

            }

        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6, 5, 4, 7, 8, 7, 5 ,5,  5,6, 56 ,48, 4, 4, };
        System.out.println(duplicados(nums));
    }
}



























