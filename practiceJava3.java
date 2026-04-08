public class practiceJava3 {

    public static void main(String[] args) {

        practiceJava3 p = new practiceJava3();

        // task-1
//        int[] nums1 = {2, 1, 2, 3, 4};
//        System.out.println(p.countEvens(nums1));
        // task-2
//        int[] nums2 = {1, 2, 2, 1};
//        System.out.println(p.sum13(nums2));
        // task-3
        int[] nums3 = {0, 2, 4};
        System.out.println(p.lucky13(nums3));
    }

    public int countEvens(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }
    public int sum13(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                i++;
            }
            else {
                sum = sum + nums[i];
            }
        }
        return sum;
    }
    public boolean lucky13(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

}