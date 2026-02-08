public class NumberRecursion {
    public static void main(String[] args) {
        System.out.println(printNumber(1));
    }
    static int printNumber(int n){
        if(n==5){
            return n;
        }
        System.out.println(n);
        return printNumber(n+1);
    }
}
