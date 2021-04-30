package week_3;

import org.junit.Test;

import static org.junit.Assert.*;
import static week_3.OptimizedArraySum.sum;

public class OptimizedArraySumTest {

  @Test
  public void sumLongArray() {
    int[] longArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int longArraySum = ArraySum.sum(longArray);

    assertEquals(55, longArraySum);
  }

  @Test
  public void sumShortArray() {
    int[] shortArray = {1, 2, 3};

    int shortArraySum = ArraySum.sum(shortArray);

    assertEquals(6, shortArraySum);
  }

  @Test
  public void sumEmptyArray() {
    int[] emptyArray = {};

    int emptyArraySum = ArraySum.sum(emptyArray);

    assertEquals(0, emptyArraySum);
  }

  @Test
  public void sumNegativeArray() {
    int[] negativeArray = {-1};

    int negativeArraySum = ArraySum.sum(negativeArray);

    assertEquals(-1, negativeArraySum);
  }

  @Test(expected = NullPointerException.class)
  public void sumNoArray() {
    int[] noArray = null;

    ArraySum.sum(noArray);
  }
}
