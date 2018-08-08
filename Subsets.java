// Problem Source : https://leetcode.com/problems/subsets/
// Author : Bala Vineeth Netha Thatipamula
// Date   : 07-26-2018



import java.util.List;
import java.util.ArrayList;

public class Subsets{
  public static void main(String[] args) {
    int[] array = {1, 2, 3};

    List<List<Integer>> result1 = getSubsetsDFS(array);
    for(List<Integer> list: result1){
      for(int num: list){
        System.out.print(num + " ");
      }
      System.out.println();
    }

    List<List<Integer>> result2 = getSubsetsBFS(array);
    for(List<Integer> list: result2){
      for(int num: list){
        System.out.print(num + " ");
      }
      System.out.println();
    }
  }

  public static List<List<Integer>> getSubsetsBFS(int[] array){
    List<List<Integer>> res = new ArrayList<>();
    if(array == null || array.length == 0) return res;
    res.add(new ArrayList<Integer>());

    for(int i = 0; i < array.length; i++){
      int size = res.size();
      for(int j = 0; j < size; j++){
        ArrayList<Integer> tmp = new ArrayList<Integer>(res.get(j));
        tmp.add(array[i]);
        res.add(tmp);
      }
    }

    return res;
  }

  public static List<List<Integer>> getSubsetsDFS(int[] array){
    List<List<Integer>> result = new ArrayList<>();
    if(array == null || array.length == 0) return result;
    List<Integer> list = new ArrayList<>();
    dfs(result, list, array, 0);
    return result;
  }

  public static void dfs(List<List<Integer>> res, List<Integer> list, int[] array, int index){
    if(index <= array.length){
      res.add(new ArrayList<Integer>(list));
    }
    for(int i = index; i < array.length; i++){
      list.add(array[i]);
      dfs(res, list, array, i+1);
      list.remove(list.size()-1);
    }
  }
}
