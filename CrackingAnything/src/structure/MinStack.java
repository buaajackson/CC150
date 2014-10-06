package structure;

import java.util.Stack;

public class MinStack extends Stack<Integer>{

	private Stack<Integer> stack;
	private Stack<Integer> min;
	
	public MinStack(){
		stack = new Stack<Integer>();
		min = new Stack<Integer>();
	}
	
	public Stack<Integer> getStack() {
		return stack;
	}
	public void setStack(Stack<Integer> stack) {
		this.stack = stack;
	}
	
	public void push(int e){
		stack.add(e);
		
		if(min.size() == 0){
			min.add(e);
		} else if(e <= min.peek()){
			min.add(e);
		}
	}
	
	public Integer pop(){
		try {
			if(stack.peek() == min.peek()){
				min.pop();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return stack.pop();
	}
	
	public Integer getMin(){
		
		return min.peek();
	}
}
