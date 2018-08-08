import java.util.HashSet;

public class ContainsDuplicates{
  //Gives true when array contains duplicates, False if does not contains any
  public static boolean containsDuplicates(int[] nums){
    if(nums == null)
      return false;
    if(nums.length == 1)
      return false;

    HashSet<Integer> set = new HashSet<Integer>();
    for(int i = 0; i < nums.length; i++){
      if(!set.contains(nums[i]))
        set.add(nums[i]);
      else
        return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int[] nums = {2, 4, 5, 7, 8, 1, 19};
    System.out.println(ContainsDuplicates.containsDuplicates(nums));
  }
}
