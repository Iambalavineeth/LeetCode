// Problem Source : https://leetcode.com/problems/same-tree/
// Author : Bala Vineeth Netha Thatipamula
// Date   : 06-21-2018

public class SameTree{
  public boolean isSameTree(TreeNode t1, TreeNode t2){
    if(t1 == null) return (t2==null);
    if(t2 == null) return (t1==null);
    if(t1.val == t2.val){
      return isSameTree(t1.left, t2.left) && isSameTree(t1.right, t2.right);
    }
    return false;
  }
}
