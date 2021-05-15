package week_5;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Implementation of FiRo using Array to store items
 */
public class ArrayFiRo<T> implements FiRo<T> {

  T[] array = (T[]) new Object[1]; // initial array very short, will be extended dynamically if needed
  int size = 0; // number of actually used array items

  @Override
  public void push(T item) {

    // Check if array has still place left, extend to doubled capacity if not
    if (size == array.length) {
      T[] newArray = (T[]) new Object[array.length * 2];
      System.arraycopy(array, 0, newArray, 0, array.length);
      array = newArray;
    }

    // Add new item
    array[size] = item;
    size++;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public T top() throws NoSuchElementException {
    if (size == 0) {
      throw new NoSuchElementException();
    }

    // Get random index r with 1 <= r <= size
    int randIndex = (int) (Math.random() * size);

    return array[randIndex];
  }

  @Override
  public void pop() throws NoSuchElementException {

    // Get random index r with 1 <= r <= size
    int randIndex = (int) (Math.random() * (size + 1));

    // Left shift items right to randomly selected one (thus, overwriting it)
    for (int i = randIndex; i < array.length - 1; i++) {
      array[i] = array[i + 1];
    }

    size--;
    array[size] = null; // delete last element - although unusable, since outside size
  }

  @Override
  public String toString() {
    return "ArrayFiRo{" +
        "array=" + Arrays.toString(array) +
        ", size=" + size +
        '}';
  }

  public static void main(String[] args) {

    // Create empty FiRo
    FiRo<Integer> arrayFiRo = new ArrayFiRo<>();
    System.out.println(arrayFiRo);
    System.out.println(arrayFiRo.isEmpty());

    // Add items to FiRo
    for (int i = 0; i < 5; i++) {
      arrayFiRo.push(i);
      System.out.println(arrayFiRo);
    }

    System.out.println(arrayFiRo);

    // Peek at random item in FiRo
    Integer top = arrayFiRo.top();
    System.out.println(top);

    // Remove random item from FiRo
    arrayFiRo.pop();
    System.out.println(arrayFiRo);
  }
}
