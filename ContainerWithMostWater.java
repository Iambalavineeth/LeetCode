// Problem Source : https://leetcode.com/problems/container-with-most-water/
// Author : Bala Vineeth Netha Thatipamula
// Date   : 07-16-2018

/*******************************************************************************
* Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai).
* n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
* Find two lines, which together with x-axis forms a container, such that the container contains the most water.
*******************************************************************************/

/*******************************************************************************
* Solution: We can solve this problem by using two pointers, both on the corners
* of the array(left and right). Now, have a running max to record the max area,
*
* How to find area? Width: (right - left), Length: This will be the min length
* among the two heights of the array as the longer will not contribute for the
* storing the water.
* Therefore area: (right-left)*min(arr[left], arr[right])
*
* Move the pointer accordingly, move the smaller height pointer accordingly.
*******************************************************************************/

public class ContainerWithMostWater{
  public static void main(String[] args) {
    int[] array = {1,8,6,2,5,4,8,3,7};
    System.out.println(maxAreaContainer(array));
  }

  public static int maxAreaContainer(int[] array){
    if(array == null || array.length == 0) return 0;
    int left = 0, right = array.length-1;
    int maxArea = 0;
    while(left < right){
      maxArea = Math.max(maxArea, (right-left) * (Math.min(array[left], array[right])));
      //Move left - If left height is less else move right
      if(array[left] < array[right]){
        left++;
      } else{
        right--;
      }
    }
    return maxArea;
  }
}
