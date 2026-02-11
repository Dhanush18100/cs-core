import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        String binary="";
        while(n>0){
            int temp=n%2;
            binary=temp+binary;
            n/=2;
        }
        System.out.println(binary);
    }
}
