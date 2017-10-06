public class ComplexNumberMultiplication{

  public static String complexMultiply(String input1, String input2){
    String[] parts1 = input1.split("\\+");
    String[] parts2 = input2.split("\\+");

    int real  = ((Integer.parseInt(parts1[0]) * Integer.parseInt(parts2[0])) - (Integer.parseInt(parts1[1].substring(0, parts1[1].length()-1)) * Integer.parseInt(parts2[1].substring(0, parts2[1].length()-1))));
    int complex = ((Integer.parseInt(parts1[0]) * Integer.parseInt(parts2[1].substring(0, parts2[1].length()-1))) + (Integer.parseInt(parts1[1].substring(0, parts1[1].length()-1)) * Integer.parseInt(parts2[0])));

    String result = Integer.toString(real) + "+" + Integer.toString(complex) + "i";
    return result;
  }

  public static void main(String[] args) {
    String input1 = "1+1i";
    String input2 = "1+1i";

    System.out.println(ComplexNumberMultiplication.complexMultiply(input1, input2));
  }
}
