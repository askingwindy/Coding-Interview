package hry.interview.jianzhiOffer;

public class Q58NextNodeInBinaryTrees {
	public BinaryTreeNode getNext(BinaryTreeNode node){
		if(node == null){
			return null;
		}
		
		BinaryTreeNode next = null;
		
		if(node.right != null){
			//如果有右儿子，那么下一个节点就是右儿子最左的子节点
			BinaryTreeNode right = node.right;
			while(right.left != null){
				right = right.left;
			}
			next = right;
		}else{
			//如果没有右儿子，当Node是parent的左儿子时，下一个节点时parent
			BinaryTreeNode parent = node.parent;
			while(parent!= null && node != parent.left){
				node = parent;
				parent = node.parent;
			}
			next = parent;

		}
		return next;
	}
}
