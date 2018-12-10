import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
 private List<T> inner = new ArrayList<T>();
 public void push(T e) {
  inner.add(e);
 }

 public T pop() {
  return inner.remove(inner.size() - 1);
 }

 public T top() {
  return inner.get(inner.size() - 1);
 }

 /**
  * @TODO: Print a line of elements in this stack from bottom to top. Elements
  *        should be separated by a space. 
  *        Given the following input:
  *        MyStack<Integer> stack = new new MyStack<Integer>();
  *        stack.push(5); 
  *        stack.push(4); 
  *        stack.push(3);
  *        
  *        When calling stack.printStack(), print "|- 5 4 3".
  */
 public void printStack() {
  /*
   * String result = "|- ";
   * 
   * for(int i=0; i<inner.size()-1; i++){
   *   result = result + inner.get(i) + " ";
   * }
   * System.out.println(result);
   */
  
  String result = "|- ";
  
  for(int i = 0; i <= size()-1; i++) {
   result = result + inner.get(i) + " ";
  }
  System.out.println(result);
  
 }
 

 public int size() {
  return inner.size();
 }
}