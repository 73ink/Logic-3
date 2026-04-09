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
        practiceJava4 t19 = new practiceJava4();
        int[] nums = {3, 1, 3, 1, 3};
        System.out.println(t19.haveThree(nums));

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
}