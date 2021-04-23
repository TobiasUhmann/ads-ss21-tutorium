package week_3;

import org.junit.Test;

import static org.junit.Assert.*;
import static week_3.ArraySum.sum;

public class ArraySumTest {

  @Test
  public void sumFew() {
    assertEquals(6, sum(new int[]{1, 2, 3}));
  }

  @Test
  public void sumMany() {
    assertEquals(55, sum(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
  }

  @Test
  public void sumNone() {
    assertEquals(0, sum(new int[]{}));
  }

  @Test(expected = NullPointerException.class)
  public void sumNull() {
    sum(null);
  }
}