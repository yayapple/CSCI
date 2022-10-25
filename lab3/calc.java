import java.lang.Math;
import java.util.Scanner;
public class calc {
  public static void main(String[] args) {
    System.out.print("""
      Geometry calculator

          1. Calculate the area of a Circle
          2. Calculate the area of a Rectangle
          3. Calculate the area of a Triangle
          4. Quit

      Enter your choice (1 - 4)

      """);
    
    Scanner scnr = new Scanner(System.in);
    try {
      int choice = Integer.valueOf(scnr.nextLine());
      if (choice > 4 || choice < 1) {
        throw new Exception();
      }
    
      switch (choice) {
        case 1:
          AreaCircle();
          break;
        case 2:
          AreaRectangle();
          break;
        case 3:
          AreaTriangle();
          break;
        case 4:
          break;
      }
      System.exit(0);

    } catch(Exception e) {
      System.out.print("Please input a valid number.");
      System.exit(0);
    }
  }

  public static void AreaCircle() {
    Scanner scnr = new Scanner(System.in);

    double radius, area;

    System.out.println();
    System.out.println("Enter the radius of the circle:");
    radius = Double.valueOf(scnr.nextLine());

    area = Math.pow(radius, 2) * Math.PI;

    System.out.printf("%nA circle with radius %.2f will have an area of %.2f.", radius, area);
  }
  
  public static void AreaRectangle() {
    Scanner scnr = new Scanner(System.in);

    double length, width, area;

    System.out.println();
    System.out.println("Enter the length of the rectangle:");
    length = Double.valueOf(scnr.nextLine());

    System.out.println("Enter the width of the rectangle:");
    width = Double.valueOf(scnr.nextLine());

    area = length * width;

    System.out.printf("%nA rectangle with length %.2f and width %.2f will have an area of %.2f.", length, width, area);

  }

  public static void AreaTriangle() {
    Scanner scnr = new Scanner(System.in);

    double a, b, c, s, area;

    System.out.println();
    System.out.println("Enter the length of the first side:");
    a = Double.valueOf(scnr.nextLine());

    System.out.println("Enter the length of the second side:");
    b = Double.valueOf(scnr.nextLine());

    System.out.println("Enter the length of the third side:");
    c = Double.valueOf(scnr.nextLine());
    
    s = (a + b + c) / 2;
    area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

    if (Double.isNaN(area)) {
      System.out.printf("%nA triangle with side lengths %.2f, %.2f, and %.2f is not possible.", a, b, c);
    } else {
      System.out.printf("%nA triangle with side lengths %.2f, %.2f, and %.2f will have an area of %.2f.", a, b, c, area);
    }
  }
}