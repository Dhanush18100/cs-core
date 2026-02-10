public class vowelsAndConsonents {
    public static void main(String[] args) {
        String str="Hello";
        int consonent=0;
        int vowels=0;
        str=str.toLowerCase();
        for(int i=0;i<str.length();i++ ){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
                vowels++;
            else
                consonent++;

        }
        System.out.println(vowels);
        System.out.println(consonent);
    }
}
