public class Main {
  public static void main(String[] args) {
    String title = "test";
    String address = "test@test.com";
    String text = "テスト";
    email(title, address, text);
  }

  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名:" + title);
    System.out.println("本文:" + text);
  }
}