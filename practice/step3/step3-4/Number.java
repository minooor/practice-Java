import java.util.*;

public class Number {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

    if (a >= 10 || b >= 10) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
    sc.close();
  }
}