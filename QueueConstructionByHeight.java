import java.util.*;

public class QueueConstructionByHeight{
  //Sorting Heights based on Queue waiting number
  public static int[][] constructQueue(int[][] array){
    if(array.length == 1)
      return array;

    HashMap<int, ArrayList<int>> queue = new HashMap<int, ArrayList<int>>();
  }

  public static void main(String[] args) {
    int[][] input = {{7, 0}, {4, 4}, {7, 1}, {5, 0}, {6,1}, {5, 2}};
    int rows = input.length;
    int cols = input[0].length;

    //Printing the initial input
    for(int i = 0; i < rows; i++){
      for (int j = 0;j < cols ;j++ ) {
        System.out.print(input[i][j] + " ");
      }
      System.out.println();
    }

    int[][] result = QueueConstructionByHeight.constructQueue(input);
  }
}
