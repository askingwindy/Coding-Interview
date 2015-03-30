package hry.interview.jianzhiOffer;

public class BinaryTreeNode {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + val;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BinaryTreeNode other = (BinaryTreeNode) obj;
		if (val != other.val)
			return false;
		return true;
	}

	public int val;
	public BinaryTreeNode left, right, parent;
	public BinaryTreeNode(int val) {
		// TODO Auto-generated constructor stub
		this.val = val;
	}
	
	public void connectTreeNode(BinaryTreeNode left, BinaryTreeNode right){
		this.left = left;
		this.right = right;
		if(left != null){
			left.parent = this;
		}
		if(right != null){
			right.parent = this;
		}
	}
	
}
