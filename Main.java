import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    double num1 = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Enter the second number: ");
    double num2 = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Which operation are you applying?: ");
    String operation = scanner.nextLine();

    if (operation.equals("sum")) {
      System.out.printf("The sum is: %f + %f = %f", num1, num2, num1 + num2);
    } else if (operation.equals("sub")) {
      System.out.printf("The difference is: %f - %f = %f", num1, num2, num1 - num2);
    } else if (operation.equals("mul")) {
      System.out.printf("The product is: %f * %f = %f", num1, num2, num1 * num2);
    } else if (operation.equals("div")) {
      if (num2 == 0) {
        System.out.println("You cannot divide by zero.");
      } else if (num1 == 0) {
        System.out.println("The division is undefined.");
      } else {
        System.out.printf("The division is: %f / %f = %f", num1, num2, num1 / num2);
      }
    } else {
      System.out.println("%s is not an allowed operation.");
    }

    scanner.close();

  }
}