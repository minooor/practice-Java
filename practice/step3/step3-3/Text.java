import java.util.*;

public class Text {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = s.charAt(0);

        if (Character.isUpperCase(c)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
