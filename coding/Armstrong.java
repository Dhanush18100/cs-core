public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
    static boolean isArmstrong(int n){
        int original=n;
        int digit=numberOfDigit(n);
        int sum=0;
        while(n!=0){
            int temp=n%10;
            sum+=Math.pow(temp, digit);
            n/=10;
        }
        return sum==original;
    }
    static int numberOfDigit(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
}
