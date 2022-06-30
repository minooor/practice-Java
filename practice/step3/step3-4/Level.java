public class Level {
  public static void main(String[] args) {
    int level = 10;

    for(int i = 0; i < level; i++) {
      for(int j = 0; j < level + i; j++) {
        if(j < level - i - 1) {
          System.out.print("　");
        } else {
          System.out.print("■");
        }
      }
      System.out.println();
    }
  }
}