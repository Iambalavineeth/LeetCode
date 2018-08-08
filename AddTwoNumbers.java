// Problem Source : https://oj.leetcode.com/problems/add-two-numbers/
// Author : Bala Vineeth Netha Thatipamula
// Date   : 05-13-2018

/**********************************************************************************
*You are given two non-empty linked lists representing two non-negative integers.
*The digits are stored in reverse order and each of their nodes contain a single digit.
*Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
Example
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
**********************************************************************************/
/*********************************************************************************
** SOLUTION **
There are majorly 2 types of solutions for this problem. We can either solve it
iteratively/recursively.

Itereatively: We will add the values of l1, l2 and also make sure if there is any
carry forward is presnt or not. We start from start of both l1, l2 and iteratively
make new node with a value (l1.val+l2.val+carry). Once any of the nodes is null, then
we will add the node values of other Linked List to the result.

Recursively: We will add the values of nodes l1, l2 pass in the value next values of
l1 and l2 recursively into the function. The base case is if both the l1 and l2 are
null then we stop the recursion.
**********************************************************************************/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class AddTwoNumbers{
  public ListNode addTwoNumbers(ListNode l1, ListNode l2){
    if(l1 == null) return l2;
    if(l2 == null) return l1;

    ListNode res = null;
    ListNode curr = res;
    int sum = 0, carry = 0;
    while(l1 != null || l2 != null || carry != 0){
        sum = ((l1 != null) ? l1.val:0) + ((l2 != null) ? l2.val:0) + carry;
        carry = sum/10;
        ListNode temp = new ListNode(sum % 10);
        if(curr == null){
            curr = temp;
            res = curr;
        }else{
            curr.next = temp;
            curr = curr.next;
        }

        l1 = (l1 == null)? l1 : l1.next;
        l2 = (l2 == null)? l2 : l2.next;
    }
    return res;
  }

  public ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2){
    if(l1 == null) return l2;
    if(l2 == null) return l1;
    return helper(l1, l2, 0);
  }

  public ListNode helper(ListNode l1, ListNode l2, int carry){
    //Base case - If this happens return null
    if(l1 == null && l2 == null && carry == 0){
      return null;
    }
    int value = carry;
    if(l1 != null) value += l1.val;
    if(l2 != null) value += l2.val;
    ListNode result = new ListNode(value%10);
    result.next = helper(((l1 != null) ? l1.next : null),((l2 != null) ? l2.next : null), value/10);
    return result;
  }
}
