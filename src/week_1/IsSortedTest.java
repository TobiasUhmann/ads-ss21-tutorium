package week_1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsSortedTest {

  void check(int[] a, boolean expected) {
    assertEquals("Error when testing iterative implementation!", IsSorted.isSortedIterative(a), expected);
    assertEquals("Error when testing recursive implementation!", IsSorted.isSortedRecursive(a), expected);
  }

  @Test
  public void test1() {
    check(new int[]{1, 2, 3, 4, 5, 6}, true);
  }

  @Test
  public void test2() {
    check(new int[]{1, 3, 4, 5, 6, 2}, false);
  }

  @Test
  public void test3() {
    check(new int[]{3, 1, 4, 5, 6}, false);
  }

  @Test
  public void test4() {
    check(new int[]{1}, true);
  }

  @Test
  public void test5() {
    check(new int[]{}, true);
  }

  @Test
  public void test6() {
    check(new int[]{2, 2, 3, 3, 3, 3, 3}, true);
  }

  @Test
  public void test7() {
    check(new int[]{3, 3, 2, 2, 2, 2, 2}, false);
  }

}
