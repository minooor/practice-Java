public class Name {
  public static void main(String[] args) {
    String name = "菅原";
    System.out.print("私の名前は");
    System.out.print(name);
    System.out.print("です。");

    System.out.println("あなたの名前を入力してください。");
    String n = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください。");
    int age = new java.util.Scanner(System.in).nextInt();
    System.out.println("ようこそ、" + age + "歳の" + n + "さん");
  }
}