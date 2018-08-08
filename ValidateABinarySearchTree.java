// Problem Source : https://leetcode.com/problems/validate-binary-search-tree/
// Author : Bala Vineeth Netha Thatipamula
// Date   : 06-22-2018

public class ValidateABinarySearchTree{
  public boolean isValidBST(TreeNode root){
    if(root == null) return true;
    int min = Integer.MIN_VALUE;
    int max = Integer.MAX_VALUE;
    return helper(root, min, max);
  }

  public boolean helper(TreeNode root, int min, int max){
    if(root == null) return true;
    if(root.val > min && root.val < max){
      return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
    return false;
  }
}
