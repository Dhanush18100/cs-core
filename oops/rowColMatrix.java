import java.util.Arrays;

public class rowColMatrix {
    public static void main(String[] args) {
       int [][]arr={
        {10,20,30,40},
        {15,25,35,45},
        {28,29,37,49},
        {33,34,38,50},
       } ;
       System.out.println(Arrays.toString(search(arr, 37)));
    }
    static int[] search(int [][]matrix,int target){
        int row=0;
        int cols=matrix.length-1;
        while(row<matrix.length && cols>=0){
            if(matrix[row][cols]==target){
                return new int[]{row,cols};
            }
            if(matrix[row][cols]<target){
                row++;
            }else{
                cols--;
            }
        }
        return new int[]{};

    }
    
}
