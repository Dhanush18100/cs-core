public class smallestNumber {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,6,0};
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println(smallest);
    }
}
