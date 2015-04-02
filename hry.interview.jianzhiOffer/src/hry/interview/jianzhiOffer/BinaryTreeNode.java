package hry.interview.jianzhiOffer;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeNode {

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
	
	public void printTree(){		
		Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
		queue.offer(this);
	
		while(!queue.isEmpty()){
			int size = queue.size();
			for(int i=0; i<size; i++){
				BinaryTreeNode cur = queue.poll();
				if(cur ==null){
					System.out.print("null"+"\t");
					continue;
				}
				queue.offer(cur.left);
				queue.offer(cur.right);
				
				System.out.print(cur.val+"\t");
			}
			System.out.println();
		}
	}
	
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
}
