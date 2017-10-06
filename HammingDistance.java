import java.util.*;

public class HammingDistance{
  public static void main(String[] args){
    int num = 5;
    //Using th METHOD - 1
    System.out.println(HammingDistance.hammingDistance(num));
    //Using the METHOD - 2
    System.out.println(HammingDistance.numberComplement(num));
  }

    //METHOD 1 - Gives the complement of the number
    static int numberComplement(int num){
      if(num == 0)
        return 0;
      if(num == 1)
        return 1;

      String bNum = Integer.toBinaryString(num);
      int len = bNum.length();
      int result = 0;
      for(int i = len-1; i>=0; i--){
        if(bNum.charAt(i) == '0')
          result += Math.pow(2, (len-1-i));
      }
      return result;
    }

  //METHOD 2 - Convert to Binary Strings and then compare them
  static int hammingDistance(int x, int y){
    if(x == y)
      return 0;
    String xStr = Integer.toBinaryString(x);
    int xIndex = xStr.length()-1;
    System.out.println("X String: " + xStr + " X Ending Index: " + xIndex);
    String yStr = Integer.toBinaryString(y);
    int yIndex = yStr.length()-1;
    System.out.println("Y String: " + yStr + " Y Ending Index: " + yIndex);

    int diffCount = 0;
    System.out.println("Printing the Charecters before comparing them");
    while(xIndex >= 0 && yIndex >= 0){
      System.out.println("X Character: " + xStr.charAt(xIndex));
      System.out.println("Y Character: " + yStr.charAt(yIndex));
      if(xStr.charAt(xIndex) != yStr.charAt(yIndex)){
        diffCount++;
      }
      xIndex--;
      yIndex--;
    }

    //Only check for 1's in yStr
    if(xIndex < 0){
      while(yIndex >= 0){
        if(yStr.charAt(yIndex) == '1')
          diffCount++;
      }
    }
    //Only check for 1's in xStr
    if(yIndex < 0){
      while(xIndex >= 0){
        if(xStr.charAt(xIndex) == '1')
          diffCount++;
      }
    }

    return diffCount;
  }
}
