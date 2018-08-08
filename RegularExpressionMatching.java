public class RegularExpressionMatching{
  public static void main(String[] args) {
    String text = "aab";
    String pattern = "c*a*b";
    System.out.println("Text matches the pattern: " + isMatch(text, pattern));
  }

  public static boolean isMatch(String text, String pattern){
    boolean[][] dp = new boolean[text.length()+1][pattern.length()+1];
    dp[0][0] = true;
    char[] txt = text.toCharArray();
    char[] pat = pattern.toCharArray();

    //Setting the dp for empty text matching pattern
    for(int i = 0; i < pat.length; i++){
      if(pat[i] == '*' && dp[0][i-1])
        dp[0][i+1] = true;
    }

    for(int i = 0; i < txt.length; i++){
      for(int j = 0; j < pat.length; j++){
        if(pat[j] == '.' || txt[i] == pat[j])
          dp[i+1][j+1] = dp[i][j];
        else if(pat[j] == '*'){
          if(txt[i] == pat[j-1] || pat[j-1] != '.')
            dp[i+1][j+1] = dp[i+1][j-1] || dp[i][j+1] || dp[i+1][j];
          else
            dp[i+1][j+1] = dp[i+1][j-1];
        }
      }
    }
    return dp[txt.length][pat.length];
  }
}
