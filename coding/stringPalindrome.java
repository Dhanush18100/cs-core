public class stringPalindrome {
    public static void main(String[] args) {
        String s="mam";
        System.out.println(checkPalindrome(s));
    }
    static boolean checkPalindrome(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        
        return s.equals(rev);
    }
}
