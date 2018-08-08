// Problem Source : https://oj.leetcode.com/problems/two-sum/
// Author : Bala Vineeth Netha Thatipamula
// Date   : 08-20-2017

/****************************************************************
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.
*
* You may assume that each input would have exactly one solution, and you may not use the same element twice.
****************************************************************/
/****************************************************************
* Solution: We use a HashMap to solve this problem. We store the complement of the value
* and position(index), when we find the value return the given index and value of index
****************************************************************/

public class TwoSum {
    public int[] twoSum(int[] array, int target) {
        if(array == null || array.length <2)
            return array;

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i =0; i < array.length; i++){
            if(!hm.containsKey(array[i])){
                hm.put(target - array[i], i);
            }else{
                return new int[] {hm.get(array[i]), i};
            }
        }
        return new int[] {0, 0};
    }
}
