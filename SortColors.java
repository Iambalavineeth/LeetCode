public class SortColors{
  public static void main(String[] args){
    int[] colors = {2,0,2,1,1,0};

    for(int i: colors){
      System.out.print(i + " ");
    }
    System.out.println();

    sortColors(colors);
    for(int i: colors){
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void sortColors(int[] colors){
    if(colors == null || colors.length == 0) return;
    //Start out with first color and then repeat it for others
    int elem = 0;

    int slow = 0, fast = 0;
    while(slow < colors.length){
      if(fast == colors.length){
        elem++;
        fast = slow;
      }

      //check if the color matches
      if(colors[fast] == elem){
        int temp = colors[fast];
        colors[fast] = colors[slow];
        colors[slow++] = temp;
      }
      fast++;
    }
  }
}
