public class primeNumbers{
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
        
    }
    static boolean checkPrime(int n){
        while(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}