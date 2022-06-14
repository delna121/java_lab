// arrayList is a class,the elements in arraylist can be access by randomly.
import java.util.*;
class TestJavaCollection
{
	public static void main(String args[])
	{
		ArrayList<String> list=new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("manu");
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}

	