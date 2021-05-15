package week_5;

import java.util.NoSuchElementException;

/**
 * First in, Random out
 */
public interface FiRo<T> {

  void push(T e);

  boolean isEmpty();

  T top() throws NoSuchElementException;

  void pop() throws NoSuchElementException;
}
