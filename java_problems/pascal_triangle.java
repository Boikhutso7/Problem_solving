package java_problems;

public class pascal_triangle {

    public void main(String[] args){

        int rowsize = 5;

        int[][] pascal_triangle = new int[rowsize][];

        for(int row = 0; row < rowsize; row++ ){

            pascal_triangle[row] = new int [row + 1];
            pascal_triangle[row][0] = row + 1; 
            pascal_triangle[row][row] = row + 1;
        

            for (int column = 1; column < row; column++){
                pascal_triangle[row][column] = pascal_triangle[row-1][column-1] + pascal_triangle[row-1][column];
            }
        }
        for(int row = 0; row < rowsize; row++){
            
            for(int space = 0; space < rowsize-row; space++){
                    System.err.print(" ");
            }
        }


    }
    
}
