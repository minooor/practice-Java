public class Age {
  public static void main(String[] args) {
    int age = 13;
    System.out.println("年齢:" + age);

    if(age >= 20) {
      System.out.println("成人です");
    } else if(age < 20 && age >= 0) {
      System.out.println("未成年です");
      if (age < 6 || age > 14) {
        System.out.println("今は義務教育を受けていません");
      } else {
        System.out.println("今は義務教育を受けています");
      }
    } else {
      System.out.println("エラー");
    }
  }
}