package week_8;

public class DLinkedPQueue<T> {

  Node head;
  Node tail;

  public class Node {

    T obj;
    int priority;

    Node next;
    Node prev;

    public Node(T obj, int priority) {
      this.obj = obj;
      this.priority = priority;
    }
  }

  public DLinkedPQueue() {
    // FIXME: implement
  }

  public void add(T obj, int priority) {
    // FIXME: implement
  }

  public T pop() {
    // FIXME: implement
  }

  public void removeAll(int priority) {
    // FIXME: implement
  }

  public static void main(String[] args) {
  }
}
