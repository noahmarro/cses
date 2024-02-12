import java.io.*;

public class WeirdAlgorithm {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(reader.readLine());
    while (n > 0) {
      System.out.print(n + " ");
      n = n % 2 == 0 ? n / 2 : n > 1 ? n * 3 + 1 : 0;
    }
  }
}
