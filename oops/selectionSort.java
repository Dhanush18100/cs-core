import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
         int arr[]={5,4,3,2,1};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void SelectionSort(int []arr){
        for (int i = 0; i < arr.length; i++) {
            int min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;

        }
    }
}
