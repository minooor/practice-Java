public class Main {
  public static void main(String[] args) {
    boolean tenki = true;
    if (tenki == true) {
      System.out.println("洗濯をします");
      System.out.println("散歩に行きます");
    } else {
      System.out.println("DVDを見ます");
    }

    boolean doorClose = true;
    if (doorClose == false) {
      System.out.println("ノックする");
      System.out.println("1分待つ");
    } else {
      System.out.println("トイレに入る");
    }
  }
}