import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int [] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    for (int x : a) {
      if (x == 0) {
        System.out.println("NO");
        sc.close();
        return;
      }
    }
    System.out.println("YES");
    sc.close();
  }
}