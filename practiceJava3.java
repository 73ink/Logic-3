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
//        int[] nums6a = {1, 2, 3};
//        int[] nums6b = {2, 3, 10};
//        System.out.println(p.matchUp(nums6a, nums6b));
        // task-7
//        int[] nums7 = {2, 1, 3, 5};
//        System.out.println(p.modThree(nums7));
        // task-8
//        int[] nums8 = {5, 6, 45, 99, 13, 5, 6};
//        System.out.println(p.sameEnds(nums8, 2));
        // task-9
//        int[] nums9 = {6, 2, 5, 3};
//        int[] result9 = p.shiftLeft(nums9);
//        for (int i = 0; i < result9.length; i++) {
//            System.out.println(result9[i]);
//        }
        // task-10
//        int[] nums10 = {2, 4, 1, 2};
//        int[] result10 = p.post4(nums10);
//        for (int i = 0; i < result10.length; i++) {
//            System.out.println(result10[i]);
//        }
        // task-11
//        int[] nums11 = {1, 10, 10, 2};
//        int[] result11 = p.withoutTen(nums11);
//        for (int i = 0; i < result11.length; i++) {
//            System.out.println(result11[i]);
//        }
        // task-12
        String[] result12 = p.fizzBuzz(1, 6);
        for (int i = 0; i < result12.length; i++) {
            System.out.println(result12[i]);
        }

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
    public boolean modThree(int[] nums) {

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                return true;
            }
            else if (nums[i] % 2 != 0 && nums[i + 1] % 2 != 0 && nums[i + 2] % 2 != 0) {
                return true;
            }
        }
        return false;
    }
    public boolean sameEnds(int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            if (nums[i] != nums[nums.length - n + i]) {
                return false;
            }
        }
        return true;
    }
    public int[] shiftLeft(int[] nums) {
        int first = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = first;
        return nums;
    }
    public int[] post4(int[] nums) {
        int lastIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                lastIndex = i;
            }
        }
        int[] result = new int[nums.length - lastIndex - 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[lastIndex + 1 + i];
        }
        return result;
    }
    public int[] withoutTen(int[] nums) {

        int[] result = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 10) {
                result[index] = nums[i];
                index++;
            }
        }

        return result;
    }
    public String[] fizzBuzz(int start, int end) {

        String[] result = new String[end - start];
        int index = 0;

        for (int i = start; i < end; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                result[index] = "FizzBuzz";
            }
            else if (i % 3 == 0) {
                result[index] = "Fizz";
            }
            else if (i % 5 == 0) {
                result[index] = "Buzz";
            }
            else {
                result[index] = String.valueOf(i);
            }

            index++;
        }

        return result;
    }



}