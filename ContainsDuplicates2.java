import java.util.Hashtable;

public class ContainsDuplicates2{
  //Gives true when array contains duplicates, False if does not contains any
  public static boolean containsDuplicates(int[] nums, int k){
    if(nums == null)
      return false;
    if(nums.length == 1)
      return false;

    Hashtable<Integer, Integer> table = new Hashtable<Integer, Integer>();
    for(int i = 0; i < nums.length; i++){
      if(!table.containsKey(nums[i])){
        table.put(nums[i], i);
      }
      else{
        //Check for the difference between the index of two duplicates
        if(i - table.get(nums[i]) <= k)
          return true;
      }
    }
    return false;
  }

  public static void main(String[] args) {
    int[] nums = {7, 4, 9, 5, 8, 19, 7};
    int k = 3;
    System.out.println(ContainsDuplicates2.containsDuplicates(nums, k));
  }
}
