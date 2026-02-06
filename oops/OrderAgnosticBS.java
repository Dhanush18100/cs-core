public class OrderAgnosticBS {
    public static void main(String[] args) {
         int[] ascArr = {2, 5, 8, 12, 16, 23, 38};
        int[] descArr = {90, 75, 60, 45, 30, 15, 5};

        System.out.println(orderAgnosticBS(ascArr, 16));   // Output: 4
        System.out.println(orderAgnosticBS(descArr, 45)); //3
        
    }
    static int orderAgnosticBS(int []arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=false;
        if(arr[start]<arr[end]){
            isAsc=true;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(arr[mid]<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }else{
                if(arr[mid]>target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

}
