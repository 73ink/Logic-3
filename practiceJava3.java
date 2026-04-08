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
//        int[] nums3 = {0, 2, 4};
//        System.out.println(p.lucky13(nums3));
        // task-4
//        int[] result4 = p.fizzArray(5);
//        for (int i = 0; i < result4.length; i++) {
//            System.out.println(result4[i]);
//        }
        // task-5
//        int[] nums5 = {1, 2, 3};
//        System.out.println(p.no14(nums5));
        // task-6
        int[] nums6a = {1, 2, 3};
        int[] nums6b = {2, 3, 10};
        System.out.println(p.matchUp(nums6a, nums6b));   // 2

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
    public int[] fizzArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result;
    }
    public boolean no14(int[] nums) {
        boolean has1 = false;
        boolean has4 = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                has1 = true;
            }
            if (nums[i] == 4) {
                has4 = true;
            }
        }

        if (has1 == true && has4 == true) {
            return false;
        }
        else {
            return true;
        }
    }
    public int matchUp(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {

            if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) {
                count++;
            }
        }
        return count;
    }

}