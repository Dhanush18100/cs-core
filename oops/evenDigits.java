public class evenDigits {
    public static void main(String[] args) {
        int arr[]={18,124,9,1764,98,1};
        System.out.println(findNumbers(arr));
        
    }
    static int findNumbers(int []arr){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(findDigits(arr[i])%2==0){
                count++;
            }
        }
       return count;
    }
    static int findDigits(int num){
        int digit=0;
        while(num>0){
            digit++;
            num/=10;
        }
        return digit;
    }
}
