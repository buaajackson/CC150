package structure;

import java.util.Stack;

public class QueueBasedOnStack {

	private Stack<Integer> one;
	private Stack<Integer> two;
	
	public QueueBasedOnStack(){
		one = new Stack<Integer>();
		two = new Stack<Integer>();
	}
	
	public Stack<Integer> getOne() {
		return one;
	}
	public void setOne(Stack<Integer> one) {
		this.one = one;
	}
	public Stack<Integer> getTwo() {
		return two;
	}
	public void setTwo(Stack<Integer> two) {
		this.two = two;
	}
	
	public void push(int n){
		one.add(n);
	}
	
	public Integer pop(){
		if(two.isEmpty()){
			while(!one.isEmpty()){
				two.add(one.pop());
			}
		}
		
		return two.pop();
	}
}
