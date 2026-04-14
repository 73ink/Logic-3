public class practiceJava5 {
    public static void main(String[] args){
        // task-1
        practiceJava5 t1 = new practiceJava5();
        System.out.println(t1.makeBricks(3, 1, 8));


    }
    public boolean makeBricks(int small, int big, int goal){

        int bigUsed;

        if (big < goal / 5){
            bigUsed = big;
        }
        else{
            bigUsed = goal / 5;
        }

        int remaining = goal - (bigUsed * 5);

        if (small >= remaining){
            return true;
        }
        else{
            return false;
        }
    }
}
