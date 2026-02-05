import java.util.Arrays;

public class searchIn2DArray {
    public static void main(String[] args) {
        int [][]arr={
            {23,4,1},
            {18,12,3,9},
            {78,99,34,56}
        };
        int target=34;
        System.err.println(Arrays.toString(search(arr,target)));
    }
    static int[] search(int [][]arr,int target){
        for(int rows=0;rows<arr.length;rows++){
            for(int cols=0;cols<arr[rows].length;cols++){
                if(arr[rows][cols]==target){
                    return new int[]{rows,cols};
                }
            }
        }
        return  new int[]{};
    }
}
