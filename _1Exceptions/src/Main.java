public class Main {
    public static void main(String[] args) {
        System.out.println(checkRange(2,10, 16));

    }

    static boolean checkRange(int first, int last, int check){
        if ((check >= first) && (check <= last)){
           return true;
        } else {
            throw new ArithmeticException("numero non è compreso nel range");
        }
    }
}