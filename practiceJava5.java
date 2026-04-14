public class practiceJava5 {
    public static void main(String[] args){
        // task-1
//        practiceJava5 t1 = new practiceJava5();
//        System.out.println(t1.makeBricks(3, 1, 8));
        // task-2
        practiceJava5 t2 = new practiceJava5();
        System.out.println(t2.noTeenSum(1, 2, 3));



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
    public int noTeenSum(int a, int b, int c){

        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n){

        if (n >= 13 && n <= 19 && n != 15 && n != 16){
            return 0;
        }
        else{
            return n;
        }
    }
}
