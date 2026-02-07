public class Main {
    public static void main(String[] args) {
        //pattern1(4);
       // pattern2(4);
       //pattern3(4);
       //pattern4(4);
       //pattern5(5);
       //patten6(4);
       //pattern7(5);
       //pattern8(5);
       //pattern9(5);
       //pattern10(5);
    }

    // Patern 1
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Pattern 2
    static void pattern2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //Patten 3
    static void pattern3(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //Patten 4
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    //Patten 5
    static void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //patten 6
    static void patten6(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Pattern 7
    static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Patten 8
    static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.err.print("*");
            }
            System.out.println();
        }
    }

    //pattern 9
    static void pattern9(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k+" ");
            }
            for(int k=2;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();

        }
    }

    //Pattern 10
    static void pattern10(int n){
        int original=n;
        n=2*n;
      for(int i=0;i<=n;i++){
        for(int j=0;j<=n;j++){
            int atEveryIndex=original-Math.min(Math.min(i,j), Math.min(n-i,n-j));
            System.err.print(atEveryIndex+" ");
        }
        System.out.println();
      }  
    }

}
