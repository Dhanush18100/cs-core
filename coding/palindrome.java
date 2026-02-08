public class palindrome {
    public static void main(String[] args) {
        int n=121;
        if(isPalindrome(n)){
            System.out.println(n+" is palindrome");
        }else{
            System.out.println(n+" is not a palindrome");
        }
    }
    static boolean isPalindrome(int n){
        int original=n;
        int rev=0;
        while(n!=0){
            int temp=n%10;
            rev=rev*10+temp;
            n/=10;
        }
        return original==rev;
    }
}
