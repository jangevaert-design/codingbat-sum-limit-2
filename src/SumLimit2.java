public class SumLimit2 {
  public int sumLimit(int a, int b) {
    String stra = String.valueOf(a);
    String strsum = String.valueOf(a + b);

    if (stra.length() == strsum.length()) {
      return a + b;
    } else if (strsum.length() > stra.length()) {
      return a;
    } else {
      return b;
    }
  }
}
