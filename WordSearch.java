public class WordSearch{
  public static void main(String[] args){
    char[][] board = {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
    String word = "ABCCED";

    System.out.println("The given word " + word + " is present or not: " + exist(board, word));
  }

  public static boolean exist(char[][] board, String word){
    if(board == null || board.length == 0) return false;
    int rows = board.length, cols = board[0].length;
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        if(board[i][j] == word.charAt(0) && backtrack(board, word, i, j, 0)){
          return true;
        }
      }
    }
    return false;
  }

  public static boolean backtrack(char[][] board, String word, int x, int y, int index){
    if(index == word.length())
      return true;

    if(x < 0 || x >= board.length || y < 0 || y >= board[0].length || board[x][y] != word.charAt(index))
      return false;

    //Mark this char as # so that the recursion will not come to this place
    char temp = board[x][y];
    board[x][y] = '#';
    //Try to check in all possible directions
    boolean result = (backtrack(board, word, x+1, y, index+1)
        || backtrack(board, word, x-1, y, index+1)
        || backtrack(board, word, x, y+1, index+1)
        || backtrack(board, word, x, y-1, index+1));
    //Set back the char - after the process is done
    board[x][y] = temp;

    return result;
  }
}
