public class Div2345 {
  public static void main(String[] args) {
    int num = Integer.valueOf(args[0]);
    boolean div = false;
    for (int i = 2; i < 6; i++) {
      if (num % i == 0) {
        System.out.printf("%d is divisible by %d%n", num, i);
        div = true;
      }
    }
    if (div == false) {
      System.out.println(num + " is not divisible by any of 2, 3, 4, nor 5.");
    }
  }
}