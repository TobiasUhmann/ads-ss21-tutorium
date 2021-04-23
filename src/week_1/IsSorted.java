package week_1;

import java.util.Arrays;

public class IsSorted {

  public static boolean isSortedIterative(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      if (a[i] > a[i + 1]) {
        return false;
      }
    }

    return true;
  }

  public static boolean isSortedRecursive(int[] a) {
    if (a.length <= 1) {
      return true;
    }

    var first = a[0];
    var rest = Arrays.copyOfRange(a, 1, a.length);

    return first <= rest[0] && isSortedRecursive(rest);
  }

}
