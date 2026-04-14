public class practiceJava5 {
    public static void main(String[] args){
        // task-1
//        practiceJava5 t1 = new practiceJava5();
//        System.out.println(t1.makeBricks(3, 1, 8));
        // task-2
//        practiceJava5 t2 = new practiceJava5();
//        System.out.println(t2.noTeenSum(1, 2, 3));
        // task-3
//        practiceJava5 t3 = new practiceJava5();
//        System.out.println(t3.blackjack(19, 21));
        // task-4
//        practiceJava5 t4 = new practiceJava5();
//        System.out.println(t4.loneSum(1, 2, 3));
        // task-5
        practiceJava5 t5 = new practiceJava5();
        System.out.println(t5.roundSum(12, 13, 14));

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
    public int blackjack(int a, int b){

        if (a > 21 && b > 21){
            return 0;
        }
        else if (a > 21){
            return b;
        }
        else if (b > 21){
            return a;
        }
        else{
            if (21 - a < 21 - b){
                return a;
            }
            else{
                return b;
            }
        }
    }
    public int loneSum(int a, int b, int c){

        int sum = 0;

        if (a != b && a != c){
            sum = sum + a;
        }

        if (b != a && b != c){
            sum = sum + b;
        }

        if (c != a && c != b){
            sum = sum + c;
        }

        return sum;
    }
    public int roundSum(int a, int b, int c){

        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num){

        int remainder = num % 10;

        if (remainder >= 5){
            return num + (10 - remainder);
        }
        else{
            return num - remainder;
        }
    }
}
