import java.util.Arrays;

public class Sort3 {
  public static void main(String[] args) {
    if (args.length != 3) {
      throw new Error("please provide 3 doubles");
    }
    double small, medium, large;
    double[] darray = new double[args.length];

    for (int i = 0; i < 3; i++) {
      darray[i] = Double.valueOf(args[i]);
    }

    Arrays.sort(darray);

    small = darray[0];
    medium = darray[1];
    large = darray[2];

    System.out.printf("The three numbers you entered: small is %s, medium is %s, large is %s%n", small, medium, large);
    System.out.printf("The three numbers you entered: large is %s, medium is %s, small is %s", large, medium, small);
  }
}