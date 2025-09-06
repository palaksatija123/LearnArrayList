import java.util.Stack;

public class LearnStack {
	
public static void main(String[] args) {
    Stack<String> animals = new Stack();
    animals.push("lion");
    animals.push("dog");
    animals.push("horse");
    animals.push("cat");
    
    System.out.println("Stack : " + animals);
    
    System.out.println(animals.peek());  // which element is on top ? Output:cat
    
    animals.pop();  //removes and returns the element from the top of the stack.
    System.out.println("Stack : " + animals);
    
    System.out.println(animals.peek());
    
    
}
}
