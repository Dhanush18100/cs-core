public class LCM {
    public static void main(String[] args) {
        int a = 12, b = 18;
        System.out.println(lcm(a, b));
       
    }
    static int lcm(int a,int b){
         int max=Math.max(a, b);
        while(true){
            if(max%a==0 && max%b==0){
                return max;
            }
            max++;
        }
    }
    
}
