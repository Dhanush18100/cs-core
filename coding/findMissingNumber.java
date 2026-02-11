public class findMissingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        int actual_sum=0,current_sum=0;
        for(int i=1;i<=arr.length;i++){
            actual_sum+=i;
        }
        for(int i=0;i<arr.length;i++){
            current_sum+=arr[i];
        }
        System.out.println(current_sum-actual_sum);
    }
}
