package structure;

public class LinkedListContainer {

	private ListNode nodeA;
	private ListNode nodeB;
	private int carrier;
	private ListNode resultNode;
	
	public ListNode getResultNode() {
		return resultNode;
	}

	public void setResultNode(ListNode resultNode) {
		this.resultNode = resultNode;
	}

	public LinkedListContainer(ListNode result, int carr){
		this.resultNode = result;
		this.carrier = carr;
	}

	public ListNode getNodeA() {
		return nodeA;
	}

	public void setNodeA(ListNode nodeA) {
		this.nodeA = nodeA;
	}

	public ListNode getNodeB() {
		return nodeB;
	}

	public void setNodeB(ListNode nodeB) {
		this.nodeB = nodeB;
	}

	public int getCarrier() {
		return carrier;
	}

	public void setCarrier(int carrier) {
		this.carrier = carrier;
	}
}
