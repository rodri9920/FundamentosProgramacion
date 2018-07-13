
package tictactoe;


public class MatrixHelper {
    public void print(String[][] matrix) {
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(" " + matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public boolean checkWinner(String[][] matrix) {
        return checkSameRows(matrix) || checkSameCols(matrix) || checkDiagonalA(matrix) || checkDiagonalB(matrix);
    }
    
    private boolean checkSameRows(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String initial = matrix[i][0];
            boolean same = true;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] != initial) {
                    same = false;
                }
            }
            if (same) {
                return same;
            }
        }
        return false;
    }
    
    private boolean checkSameCols(String[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            String initial = matrix[0][i];
            boolean same = true;
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[j][i] != initial) {
                    same = false;
                }
            }
            if (same) {
                return same;
            }
        }
        return false;
    }
    
    private boolean checkDiagonalA(String[][] matrix){
        String inicial = matrix [0][0];
        boolean igual = true;
        for(int i=0; i < matrix.length; i++){
            if(matrix[i][i] != inicial){
                igual = false;
            }
        }
        return igual;
    }
    
    private boolean checkDiagonalB(String[][] matrix){
        String inicial = matrix[0][2];
        boolean igual = true;
        int j = 2;
        for(int i=0; i < matrix.length; i++){
            
            if(matrix[i][j] != inicial){
                igual = false;
            }
            j--;
        }
        return igual;
    }
}
