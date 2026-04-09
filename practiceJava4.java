public class practiceJava4 {
   public static void main (String[] args){
       // task-1
    practiceJava4 t1 = new practiceJava4();
    int[] nums = {1, 4, 1, 4};
    System.out.println(t1.only14(nums));   // true

}

public boolean only14(int[] nums){
    for (int i = 0; i< nums.length; i++){
        if (nums[i] != 1 && nums[i] !=4){
        return false;
        }
        }
    return true;
    }
}
