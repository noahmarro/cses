import java.util.Scanner;

public class WeirdAlgorithm {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long n = input.nextInt();
    input.close();
    wa(n);
  }

  private static void wa(long n) {
    System.out.print(n + " ");
    if (n > 1) {
      if (n % 2 == 0) {
        wa(n / 2);
      } else {
        wa(n * 3 + 1);
      }
    }
  }
}
