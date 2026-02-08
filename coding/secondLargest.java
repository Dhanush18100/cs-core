public class secondLargest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int largest=arr[arr.length-1];
        int secondlargest=-1;
        for(int i=arr.length-2;i>0;i--){
            if(arr[i]!=largest){
                secondlargest=arr[i];
                break;
            }
        }
        System.out.println(secondlargest);
    }
}
