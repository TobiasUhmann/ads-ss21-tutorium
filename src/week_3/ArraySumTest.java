package week_3;

import org.junit.Test;

import static org.junit.Assert.*;
import static week_3.ArraySum.sum;

public class ArraySumTest {

  @Test
  public void sumLongArray() {
    int[] longArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    int longArraySum = sum(longArray);

    assertEquals(55, longArraySum);
  }

  @Test
  public void sumShortArray() {
    int[] shortArray = {1, 2, 3};

    int shortArraySum = sum(shortArray);

    assertEquals(6, shortArraySum);
  }

  @Test
  public void sumEmptyArray() {
    int[] emptyArray = {};

    int emptyArraySum = sum(emptyArray);

    assertEquals(0, emptyArraySum);
  }

  @Test
  public void sumNegativeArray() {
    int[] negativeArray = {-1};

    int negativeArraySum = sum(negativeArray);

    assertEquals(-1, negativeArraySum);
  }

  @Test(expected = NullPointerException.class)
  public void sumNoArray() {
    int[] noArray = null;

    sum(noArray);
  }
}
