import java.util.Scanner;

public class WeirdAlgorithm {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long n = input.nextLong();
    input.close();
    while (n >= 1) {
      System.out.print(n + " ");
      n = n % 2 == 0 ? n / 2 : n > 1 ? n * 3 + 1 : 0;
    }
  }
}
