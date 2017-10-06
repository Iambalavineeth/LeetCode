import java.util.*;

public class Palindrome{
  //Recursive Palindrome Checker
  static boolean isPalindrome(String s, int start, int end){
    if(start == end)
      return true;

    if(s.charAt(start) == s.charAt(end)){
      if(end-start > 1)
        return isPalindrome(s, start+1, end-1);
      else
        return true;
    }else{
      return false;
    }
  }

  //Checks for the Palindrome or not!
  static boolean palindrome(String inp){
    if(inp.length() == 0 || inp.length() == 1)
      return true;

    int start = 0;
    int end = inp.length()-1;
    boolean res = isPalindrome(inp, start, end);
    return res;
  }

  public static void main(String[] args){
    String input = "mlalam";
    System.out.println(Palindrome.palindrome(input));
  }
}
