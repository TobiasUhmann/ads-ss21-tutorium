package week_2;

import org.junit.Test;

import static org.junit.Assert.*;
import static week_2.Faculty.fac;

public class FacultyTest {

  @Test
  public void facPositive() {
    assertEquals(6, fac(3));
  }

  @Test
  public void facZero() {
    assertEquals(1, fac(0));
  }

  @Test(expected = IllegalArgumentException.class)
  public void facNegative() {
    fac(-1);
  }
}
