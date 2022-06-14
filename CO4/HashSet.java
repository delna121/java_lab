import java.util.ArrayDeque;
import java.util.Deque;
public class DeQueue
{
	public static void main(String[] args)
	{
		Deque<Integer> deque =new ArrayDeque<Integer>();
		deque.add(10);
		deque.add(20);
		deque.add(36);
		deque.push(11);
		deque.offer(159);
		System.out.println("inserted elementes are:");
		for(Integer a :deque)
		{
			System.out.println(a);
		}
		deque.removeFirst();
		deque.removeLast();
		System.out.println("after deletion" +deque);
		deque.pop();
		for(Integer integer:deque)
		{
			System.out.println(integer);
		}
		
	}
}