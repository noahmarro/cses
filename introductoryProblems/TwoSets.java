import java.io.*;

public class TwoSets {
  private static int n;

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    n = Integer.parseInt(reader.readLine());
    if (n * (n + 1) / 2 % 2 != 0) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
      if (n % 2 == 0) {
        print(new StringBuilder(), 1, n);
        print(new StringBuilder(), 2, n - 1);
      } else {
        print(new StringBuilder("1 2 "), 4, n);
        print(new StringBuilder("3 "), 5, n - 1);
      }
    }
  }

  private static void print(StringBuilder s, int l, int r) {
    System.out.println(n / 2 + (s.length() == 4 ? 1 : 0));
    while (l < r) {
      s.append(l);
      s.append(' ');
      s.append(r);
      s.append(' ');
      l += 2;
      r -= 2;
    }
    System.out.println(s.toString());
  }
}
