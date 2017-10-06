public class ComplexNumberMultiplication{
  public static void main(String[] args) {
    String input1 = "1+1i";
    String input2 = "1+1i";

    String[] parts1 = input1.split("\\+");
    String[] parts2 = input2.split("\\+");

    int real  = ((Integer.parseInt(parts1[0]) * Integer.parseInt(parts2[0])) - (Integer.parseInt(parts1[1].substring(0, parts1[1].length()-1)) * Integer.parseInt(parts2[1].substring(0, parts2[1].length()-1))));
    int complex = ((Integer.parseInt(parts1[0]) * Integer.parseInt(parts2[1].substring(0, parts2[1].length()-1))) + (Integer.parseInt(parts1[1].substring(0, parts1[1].length()-1)) * Integer.parseInt(parts2[0])));
    System.out.println(real);
    System.out.println(complex);

    String realStr =  Integer.toString(real);
    String complexStr = Integer.toString(complex);
    String result = realStr + "+" + complexStr + "i";
    System.out.println(result);
  }
}
