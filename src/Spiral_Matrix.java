//•	Write a program to print the 2D-matrix in spiral form.
//o Input: matrix = [[1,2,3],[4,5,6],[7,8,9]] o Output: [1,2,3,6,9,8,7,4,5]
public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("The spiral maxtrix is - ");
        for(int i=0;i<matrix[0].length;i++){
            if((i&1)==0)
                for(int j=0;j<matrix[1].length;j++)
                    System.out.print(matrix[i][j]+" ");
            else
                for(int j=matrix[1].length-1;j>=0;j--)
                    System.out.print(matrix[i][j]+" ");
        }
    }
}
