public class practiceJava4 {
    public static void main(String[] args) {
        // task-16
//    practiceJava4 t16 = new practiceJava4();
//    int[] nums = {1, 4, 1, 4};
//    System.out.println(t16.only14(nums));
        // task-17
//        practiceJava4 t17 = new practiceJava4();
//        int[] nums = {1, 2, 3, 4};
//        System.out.println(t17.isEverywhere(nums, 1));
        // task-18
//        practiceJava4 t18 = new practiceJava4();
//        int[] nums = {1, 7, 7};
//        System.out.println(t18.has77(nums));
        // task-19
//        practiceJava4 t19 = new practiceJava4();
//        int[] nums = {3, 1, 3, 1, 3};
//        System.out.println(t19.haveThree(nums));
        // task-20
//        practiceJava4 t20 = new practiceJava4();
//        int[] nums = {1, 4, 5, 6, 2};
//        System.out.println(t20.tripleUp(nums));
        // task-21
//        practiceJava4 t21 = new practiceJava4();
//        int[] nums = {2, 10, 3, 4, 20, 5};
//        int[] result = t21.tenRun(nums);
//        for (int i = 0; i < result.length; i++){
//            System.out.println(result[i]);
//        }
        // task-22
//        practiceJava4 t22 = new practiceJava4();
//        int[] nums = {1, 2, 3};
//        int[] result = t22.notAlone(nums, 2);
//        for (int i = 0; i < result.length; i++){
//            System.out.println(result[i]);
//        }
        // task-23
        practiceJava4 t23 = new practiceJava4();
        int[] nums = {0, 5, 0, 3};
        int[] result = t23.zeroMax(nums);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }


    }

    public boolean only14(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 1 && nums[i] != 4) {
                return false;
            }
        }
        return true;
    }


    public boolean isEverywhere(int[] nums, int val){
        for (int i = 0; i < nums.length - 1; i++){

            if (nums[i] != val && nums[i + 1] != val){

                return false;
            }
        }
        return true;
    }
    public boolean has77(int[] nums){
        for (int i=0; i< nums.length - 1; i++){
          if (nums[i] == 7 && nums[i + 1] == 7){
              return true;
          }
          if (i > nums.length -2){
              if (nums[i] ==7 && nums[i + 2] ==7){
                  return true;
              }
          }
        }
        return false;
    }
    public boolean haveThree(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length ; i++){
            if (nums[i] == 3){
                count++;

                if (i < nums.length -1 && nums [i + 1] ==3){
                    return false;
                }
            }
        }
        if (count == 3){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean tripleUp(int[] nums){
        for (int i = 0; i < nums.length - 2; i++){
            if (nums[i + 1] == nums[i] + 1 && nums[i + 2] == nums[i] + 2){
                return true;
            }
        }
        return false;
    }
    public int[] tenRun(int[] nums){

        boolean found = false;
        int value = 0;

        for (int i = 0; i < nums.length; i++){

            if (nums[i] % 10 == 0){
                value = nums[i];
                found = true;
            }
            else if (found == true){
                nums[i] = value;
            }
        }

        return nums;
    }
    public int[] notAlone(int[] nums, int val){

        for (int i = 1; i < nums.length - 1; i++){

            if (nums[i] == val && nums[i - 1] != val && nums[i + 1] != val){

                if (nums[i - 1] > nums[i + 1]){
                    nums[i] = nums[i - 1];
                }
                else{
                    nums[i] = nums[i + 1];
                }
            }
        }

        return nums;
    }
    public int[] zeroMax(int[] nums){

        for (int i = 0; i < nums.length; i++){

            if (nums[i] == 0){

                int maxOdd = 0;

                for (int j = i + 1; j < nums.length; j++){

                    if (nums[j] % 2 != 0 && nums[j] > maxOdd){
                        maxOdd = nums[j];
                    }
                }

                if (maxOdd != 0){
                    nums[i] = maxOdd;
                }
            }
        }

        return nums;
    }


}