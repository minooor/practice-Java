public class Main {
  public static void main(String[] args) {
    for (int i  = 0; i < 10; i ++)
    System.out.println("SPAM");


    //2 の 1 乗から 8 乗までを計算
    int x = 1;
    for (int n = 1; n < 8; n++) {
      x *= 2;
      System.out.println("2の" + n + "乗=" + x);
    }

    //7 の階乗を計算
    int y = 1;
    for (int z = 2; z <= 7 ; z++ )
    y *= z;
    System.out.println( y );
  }
}