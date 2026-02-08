public class messageRecursion {
    public static void main(String[] args) {
        printMessage(5);
        
    }
    static void printMessage(int n){
        if(n==0){
            return;
        }
        System.out.println("Hello World! ");
        printMessage(n-1);
    }
}
