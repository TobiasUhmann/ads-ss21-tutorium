package week_2;

public class Faculty {

  public static int fac(int n) {
    if (n < 0) {
      throw new IllegalArgumentException(String.format("Illegal value n = %d. Must be >= 0.", n));
    }

    if (n <= 1) {
      return 1;
    }

    return n * fac(n - 1);
  }

  public static void main(String[] args) {
    System.out.println(fac(3));
    System.out.println(fac(0));
    System.out.println(fac(-1));
  }
}
