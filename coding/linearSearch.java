public class linearSearch {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(linear(arr, 2));
        
    }
    static int linear(int []arr,int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
