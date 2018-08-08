// Problem Source : https://leetcode.com/problems/subsets-ii/
// Author : Bala Vineeth Netha Thatipamula
// Date   : 06-25-2018

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Subsets2{
  public static void main(String[] args) {
    int[] input = {1, 2, 2};
    List<List<Integer>> res = subsetsWithDup(input);
    for(List<Integer> list: res){
      for(int num: list){
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }

  public static List<List<Integer>> subsetsWithDup(int[] array){
    List<List<Integer>> res = new ArrayList<>();
    if(array == null || array.length == 0) return res;
    Arrays.sort(array);
    List<Integer> list = new ArrayList<>();
    dfs(res, list, array, 0);
    return res;
  }

  public static void dfs(List<List<Integer>> res, List<Integer> list, int[] array, int index){
    if(index <= array.length){
      res.add(new ArrayList<Integer>(list));
    }

    int i = index;
    while(i < array.length){
      list.add(array[i]);
      dfs(res, list, array, i+1);
      list.remove(list.size()-1);
      i++;
      while(i < array.length && array[i] == array[i-1]) i++;
    }
  }
}
