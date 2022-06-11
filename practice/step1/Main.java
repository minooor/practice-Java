public class Main {
  public static void main(String[] args) {
    int a = 3;
    int b = 5;
    int c = a * b;
    int m = Math.max(a, b);
    System.out.println("横幅３横幅５の長方形の面積は、" + c );
    System.out.println("比較実験：" + a + "と" + b + "とで大きい方は・・・" + m );

    //インクリメント演算子
    int d = 100;
    d++;
    System.out.println(d);
  }
}