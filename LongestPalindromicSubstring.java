// Problem Source : https://oj.leetcode.com/problems/longest-palindromic-substring/
// Author : Bala Vineeth Netha Thatipamula
// Date   : 08-05-2018

public class LongestPalindromicSubstring{
  private static int low;
  private static int maxLen;

  public static void main(String[] args) {
    String input = "babac";
    System.out.println(getLongestPalindrome(input));
  }

  public static String getLongestPalindrome(String str){
    if(str == null || str.length() <= 1) return str;
    for(int i = 0; i < str.length(); i++){
      extendPalindrome(str, i, i);          //Odd length
      extendPalindrome(str, i, i+1);        //Even length
    }
    return str.substring(low, low+maxLen);
  }

  public static void extendPalindrome(String s, int start, int end){
    while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){
      start--; end++;
    }
    if(maxLen < end-start-1){
      low = start + 1;    //As we have decremented one in the while loop
      maxLen = end-start-1; //Update the maxLen, to difference between end and start
    }
  }
}
