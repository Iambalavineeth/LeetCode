// Problem Source : https://leetcode.com/problems/search-a-2d-matrix/
// Author : Bala Vineeth Netha Thatipamula
// Date   : 07-10-2018

public class Search2DMatrix{
  public static void main(String[] args) {
    int[][] input = {{1,   3,  5,  7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
    int target1 = 10, target2 = 13;

    System.out.println(searchMatrix(input, target1));
    System.out.println(searchMatrix(input, target2));

    int[] res1 = searchAndGiveIndex(input, target1);
    System.out.println("Found indexes at: " + res1[0] + " " + res1[1]);
    int[] res2 = searchAndGiveIndex(input, target2);
    System.out.println("Found indexes at: " + res2[0] + " " + res2[1]);
  }

  public static int[] searchAndGiveIndex(int[][] input, int target){
    int[] res = {-1, -1};
    if(input == null || input.length == 0) return res;

    int rows = input.length;
    int cols = input[0].length;

    int x = 0, y = cols-1;
    while(x < rows && y >= 0){
      if(target == input[x][y]){
        res[0] = x;
        res[1] = y;
        break;
      } else if ( target < input[x][y]) y--;
      else x++;
    }
    return res;
  }

  public static boolean searchMatrix(int[][] input, int target){
    if(input == null || input.length == 0) return false;
    int rows = input.length, cols = input[0].length;
    //Start from the TOP RIGHT corner of the array
    int x = 0, y = cols-1;
    while(x < rows && y >= 0){
      if(input[x][y] == target) return true;
      else if(input[x][y] < target) x++;
      else y--;
    }
    return false;
  }
}
