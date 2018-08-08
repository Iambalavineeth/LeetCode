// Problem Source : https://leetcode.com/problems/binary-tree-inorder-traversal/
// Author : Bala Vineeth Netha Thatipamula
// Date   : 06-25-2018

import java.util.List;
import java.util.ArrayList;

public class BinaryTreeInorderTraversal{
  public List<Integer> inorderTraversal(TreeNode root){
    List<Integer> res = new ArrayList<>();
    if(root == null) return res;
    inorder(root, res);
    return res;
  }

  public void inorder(TreeNode root, List<Integer> res){
    if(root == null) return;
    inorder(root.left, res);
    res.add(root.val);
    inorder(root.right, res);
  }
}
