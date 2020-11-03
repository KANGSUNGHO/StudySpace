package prob5;

public class MyStack {
	private int top;
	private String[] buffer;
	private int count;
	public MyStack() {
		top = 0;
		count = 0;
	}
	public MyStack(int i) {
		buffer = new String[i];
	}

	public void push(String s) {
		if( count < buffer.length) {
			buffer[top++] = s;
		}
		count++;
	}

	public String pop() throws MyStackException {
//		buffer[-top];
		if (top == 0) {
			throw new MyStackException();
		} else {
			return buffer[--top];
		}
	}

	public boolean isEmpty() {
		if (top == 0)
				return true;
		else
			return false;
	}
}