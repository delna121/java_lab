import java.util.Stack;
public class StackPro
{
 public static void main(String[]args)
{
Stack<Integer>stk=new Stack<>();
boolean result=stk.empty();
stk.push(15);
stk.push(52);
stk.push(89);
stk.push(79);
System.out.println("Elements in Stack:"+stk);
int location = stk.search(15);
System.out.println("location of 15 is "+location);
result=stk.empty();
System.out.println("Is the stack empty?" +result);


}
}
 
