public class AlternatingBits{
  public static void main(String[] args) {
    int num = 7;
    int prev=-1, curr=-1;
    while(num != 0){
      curr = num%2;
      if(curr == -1){
        prev = curr;
      }else{
        if(prev==curr){
          return false;
        }else{
          prev = curr;
        }
      }
      num /= 2;
    }
    return true;
    // String num_binary = Integer.toBinaryString(num);
    // boolean flag = true;
    // for(int i = 0; i < num_binary.length()-1; i++){
    //   if(num_binary.charAt(i) == num_binary.charAt(i+1)){
    //     flag = false;
    //     break;
    //   }
    // }
    // System.out.println(flag);
  }
}
