import java.util.*;

public class CountAndSay{
  static String countAndSay(int num){
    if(num == 1)
      return "1";
    if(num == 2)
      return "11";

    String result = "11";
    while(num > 2){
      int count = 1;
      String temp = "";
      int len = result.length();
      for(int i = 1; i < len; i++){
        if(result.charAt(i) == result.charAt(i-1))
          count++;
        else{
          temp += Integer.toString(count) + result.charAt(i-1);
          count = 1;
        }
      }
      temp += Integer.toString(count) + result.charAt(len-1);
      result = temp;
      num--;
    }

    return result;
  }

  public static void main(String[] args){
    int input = 5;
    System.out.println(CountAndSay.countAndSay(input));
  }
}
