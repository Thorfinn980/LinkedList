package linkedListPackage;

public class IntNode {
    private int key;
	
	private IntNode prev;
	private IntNode next;
	
	public IntNode(int key, IntNode prev, IntNode next) {
		this.key = key;
		this.prev = prev;
		this.next = next;
	}
	
	
	public void addNodeAfter(int key) {
	    this.next = new IntNode(key, this, this.next);
	    
	    if (this.next.next != null) {
	       this.next.next.prev = this.next;
	    }   
	}
}
