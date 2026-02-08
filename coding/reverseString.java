public class reverseString {
    public static void main(String[] args) {
        String s="Hello";
        char ch[]=s.toCharArray();
        int start=0;
        int end=ch.length-1;
        while(start<=end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        System.out.println(ch);
    }  
}
