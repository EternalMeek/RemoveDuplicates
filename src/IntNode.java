
public class IntNode {
	private int data;
	private IntNode next;
	
	public IntNode(int a) {
		 data=a;
		 next=null;
	}
	
	public void setData(int d) {
		data=d;
	}
	public void setNext(IntNode node) {
		next=node;
	}
	
	public int getData() {
		return data;
	}
	public IntNode getNext() {
		return next;
	}

}
