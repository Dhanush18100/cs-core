public class largestOfThreeNumbers {
    public static void main(String[] args) {
        int a=1,b=2,c=3;
        if(a>b && a>c){
            System.out.println(a+" is greator");
        }else if(b>a && b>c){
            System.out.println(b+" is greater");
        }else{
            System.out.println(c+" is greater");
        }
    }
}
