package week_2;

import java.util.Arrays;

public class ArraySum {

  public static int sum(int[] array) {
    if (array.length <= 3) {
      return sum_linear(array);
    }

    int[] leftArray = Arrays.copyOfRange(array, 0, array.length / 2);
    int[] rightArray = Arrays.copyOfRange(array, array.length / 2, array.length);

    return sum(leftArray) + sum(rightArray);
  }

  private static int sum_linear(int[] array) {
    int result = 0;

    for (int i : array) {
      result += i;
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
