package hry.interview.jianzhiOffer;

public class Q58NextNodeInBinaryTrees {
	public BinaryTreeNode getNext(BinaryTreeNode node){
		if(node == null){
			return null;
		}
		
		BinaryTreeNode next = null;
		
		if(node.right != null){
			//������Ҷ��ӣ���ô��һ���ڵ�����Ҷ���������ӽڵ�
			BinaryTreeNode right = node.right;
			while(right.left != null){
				right = right.left;
			}
			next = right;
		}else{
			//���û���Ҷ��ӣ���Node��parent�������ʱ����һ���ڵ�ʱparent
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
