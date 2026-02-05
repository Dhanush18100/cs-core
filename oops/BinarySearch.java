public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={2,4,6,9,11,12,14,20,36,48};
        int target=36;
        System.out.println(binarySearch(arr, target));
        
    }
    static int binarySearch(int []arr,int target){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return -1;
    }
}
