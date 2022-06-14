import java.util.ArrayDeque;
import java.util.Deque;

public class DeQueue {

  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<Integer>();

    deque.add(10);
    deque.add(6);
    deque.add(7);
    System.out.println("Inserting three elements : ");
    for (Integer integer : deque) {
      System.out.println(integer);
    }
    deque.add(6);
 
    // Add at the first
    deque.addFirst(7);

    // Add at the last
    deque.addLast(8);

    // Add at the first
    deque.push(9);

    // Add at the last
    deque.offer(12);

    // Add at the first
    deque.offerFirst(10);

    System.out.println(deque + "\n");

    // We can remove the first element
    // or the last element.
    deque.removeFirst();
    deque.removeLast();
    System.out.println("Deque after removing "
                       + "first and last: "
                       + deque);
    deque.pop();
    System.out.println("After popping : ");
    for (Integer integer : deque) {
      System.out.println(integer);
    }
    deque.remove(7);
    System.out.println("Removing the element 7 :" + deque);
  }
}