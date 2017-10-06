import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class FindDuplicatesArray{
  //Finding Duplicate elements in the Given Array
  public static List<Integer> getDuplicates(int[] nums){
    HashSet<Integer> set = new HashSet<Integer>();

    List<Integer> list = new ArrayList<Integer>();
    for(int i = 0; i < nums.length; i++){
      if(!set.contains(nums[i])){
        set.add(nums[i]);
      }else{
        list.add(nums[i]);
      }
    }

    return list;
  }

  public static void main(String[] args) {
    int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
    List<Integer> result = FindDuplicatesArray.getDuplicates(nums);
  }
}
