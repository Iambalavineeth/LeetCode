public class SetMatrixZeros{
  public void setZeros(int[][] matrix){
    if(matrix == null || matrix.length == 0) return;

    //Get the row and column indexes where Zeros are present
    int[] rows = new int[matrix.length], cols = new int[matrix[0].length];
    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[0].length; j++){
        if(matrix[i][j] == 0){
          rows[i] = 1;
          cols[j] = 1;
        }
      }
    }

    for(int i = 0; i < matrix.length; i++){
      for(int j = 0; j < matrix[0].length; j++){
        if(matrix[i][j] == 1 && (rows[i] == 1 || cols[j] == 1)){
          matrix[i][j] = 0;
        }
      }
    }
  }

  public void setZeros2(int[][] matrix){
    if(matrix == null || matrix.length == 0 || matrix[0] == null || matrix[0].length == 0) return;
    int rows = matrix.length, cols = matrix[0].length, col0 = 1;

    //Set zeros on the first row and first column of the matrix
    //Also set variable col0 --> If the column has zero in the matrix
    for(int i = 0; i < rows; i++){
      if(matrix[i][0] == 0) col0 = 0;
      for(int j = 1; j < cols; j++){
        if(matrix[i][j] == 0){
          matrix[i][0] = 0;
          matrix[0][j] = 0;
        }
      }
    }

    //Start from the Bottom-Right corner of the array
    //Check for the first row or first column to whether it is set to zero
    //i.e. check for array[i][0], array[0][j] and col0 and set the value of matrix
    for(int i = rows-1; i >= 0; i--){
      for(j = cols-1; j >= 0; j--){
        if(matrix[i][0] == 0 || matrix[0][j] == 0)
          matrix[i][j] == 0;
      }
      if(col0 == 0) matrix[i][0] = 0;
    }
  }
}
