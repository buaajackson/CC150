package practice;

import java.util.Stack;
import structure.MinStack;

public class StackQueue {

	public Stack<Integer> sortStack(Stack<Integer> stack){
		Stack<Integer> back = new Stack<Integer>();
		
		while(!stack.isEmpty()){
			Integer temp = stack.pop();
			while(!back.isEmpty() && back.peek() < temp){
				stack.push(back.pop());
			}
			back.push(temp);
		}
		
		return back;
	}

}


