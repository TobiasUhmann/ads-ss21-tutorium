package week_2;

public class OptimizedArraySum {

  public static int sum(int[] array) {
    return sum(array, 0, array.length);
  }

  private static int sum(int[] array, int from, int until) {
    if (until - from <= 3) {
      int lin = sum_linear(array, from, until);
      System.out.println(lin);
      return lin;
    }

    int leftSum = sum(array, from, from + (until - from) / 2);
    int rightSum = sum(array, from + (until - from) / 2, until);

    return leftSum + rightSum;
  }

  private static int sum_linear(int[] array, int from, int until) {
    int result = 0;

    for (int i = from; i < until; i++) {
      result += array[i];
    }

    return result;
  }

  public static void main(String[] args) {
    System.out.println(sum(new int[]{1, 2, 3}));
    System.out.println(sum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    System.out.println(sum(new int[]{}));
    System.out.println(sum(null));
  }
}
