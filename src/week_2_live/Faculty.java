package week_2_live;

public class Faculty {

//  public static int fac(int n) {
//    int result = 1;
//
//    for (int i = 1; i <= n; i++) {
//      result *= i;
//    }
//
//    return result;
//  }

  public static int fac(int n) {
    if (n <= 1) {
      int result = 1;
      return result;
    }

    int result = n * fac(n - 1);
    return result;
  }

  public static void main(String[] args) {
    int n = 3;
    System.out.println(fac(n));
  }
}
