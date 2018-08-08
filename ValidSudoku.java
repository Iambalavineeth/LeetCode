// Problem Source : https://oj.leetcode.com/problems/valid-sudoku/
// Author : Bala Vineeth Netha Thatipamula
// Date   : 08-06-2018

import java.util.*;

public class ValidSudoku{
  public static void main(String[] args) {
    char[][] board = { {'5','3','.','.','7','.','.','.','.'}, {'6','.','.','1','9','5','.','.','.'}, {'.','9','8','.','.','.','.','6','.'}, {'8','.','.','.','6','.','.','.','3'}, {'4','.','.','8','.','3','.','.','1'}, {'7','.','.','.','2','.','.','.','6'}, {'.','6','.','.','.','.','2','8','.'}, {'.','.','.','4','1','9','.','.','5'}, {'.','.','.','.','8','.','.','7','9'} };

    //Printing the Suduko Board
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[0].length; j++){
        System.out.print(board[i][j] + " ");
      }
      System.out.println();
    }

    //Checking if the Sudoko is valid or not
    if(isValidSudoko(board)) System.out.println("The Sudoku is possible");
    else System.out.println("It is not possible");
  }

  public static boolean isValidSudoko(char[][] board){
    if(board == null || board.length == 0) return true;
    int rows = board.length, cols = board[0].length;
    Set<String> set = new HashSet<>();
    for(int i = 0; i < rows; i++){
      for(int j = 0; j < cols; j++){
        if(board[i][j] != '.'){
          if(!set.add(board[i][j] + " row " + i) || !set.add(board[i][j] + " column " + j) || !set.add(board[i][j] + " grid " + i/3 + " " + j/3)){
            return false;
          }
        }
      }
    }
    return true;
  }

}
