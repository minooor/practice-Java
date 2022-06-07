import java.util.Date;

public class Main {
  public static void main(String[] args) {
    long start = System.currentTimeMillis();
    long end = System.currentTimeMillis();
    System.out.println("処理にかかった時間は・・・" + (end - start) + "ミリ秒でした");
    
    Date now = new Date();  //現在の日時を取得
    System.out.println(now);
    System.out.println(now.getTime());
  }
}