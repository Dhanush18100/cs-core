import java.util.HashMap;

public class frequencyOfCharacter {
    public static void main(String[] args) {
        String str="Engineering";
        str=str.toLowerCase();
        HashMap<Character,Integer>ans=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            ans.put(ch,ans.getOrDefault(ch, 0)+1);
            
        }
        System.out.println(ans);
    }
}
