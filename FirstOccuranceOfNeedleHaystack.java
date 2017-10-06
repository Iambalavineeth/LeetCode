import java.util.*;

public class FirstOccuranceOfNeedleHaystack{
  static int firstOccurance(String haystack, String needle){
    if(haystack.length() < needle.length())
      return -1;

    int hayLen = haystack.length();
    for(int i = 0; i < hayLen-1; i++){
      if(haystack.charAt(i) == needle.charAt(0)){
        for(int j = 1; j < needle.length()-1; j++){
          if(haystack.charAt(i+j) == needle.charAt(j)){
            if(j == needle.length()-1){
              return i;
            }
            continue;
          }else
            break;
        }
      }
    }
    return -1;
  }

  public static void main(String[] args){
    String haystack = "Let me give you a suggestion";
    String needle = "you";

    System.out.println("First occurance of the needle in haystack: " + FirstOccuranceOfNeedleHaystack.firstOccurance(haystack, needle));
  }
}
