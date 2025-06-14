import java.io.*; // 入力に関するクラスを使う時は必要

class YourName {
  // throws IOException で内部で入出力エラーが起きる可能性があることを示す
  public static void main(String[] args) throws IOException {
    // 入力をするためには，System.inからBufferedReaderを作らなくてはいけない
    BufferedReader d = new BufferedReader(new InputStreamReader(System.in));
    // 文字列型(String)の変数 family, given を定義
    String family, given;
    System.out.println("名字を入力してください> ");
    // BufferedReader dから一行読み込んだ文字列を familyに入れる．
    family = d.readLine();
    System.out.println("名前を入力してください> ");
    // BufferedReader dから一行読み込んだ文字列を familyに入れる．
    given = d.readLine();
    // 表示する．
    System.out.println("あなたの名前は" + family + " " + given + "です");
  }
}