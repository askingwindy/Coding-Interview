package hry.interview.jianzhiOffer;

public class Q27ConvertBinarySearchTree {
	private BinaryTreeNode lasNodeInList = null;
	public BinaryTreeNode convert(BinaryTreeNode root){
		if(root == null){
			return root;
		}
		lasNodeInList = null;
		convertNode(root);
		
		BinaryTreeNode firstNodeInList = lasNodeInList;
		while(firstNodeInList!=null && firstNodeInList.left!=null){
			firstNodeInList = firstNodeInList.left;
		}
		return firstNodeInList;
	}
	private void convertNode(BinaryTreeNode root){
		if(root == null){
			return;
		}
		BinaryTreeNode cur = root;
		//�õ������
		if(cur.left !=null){
			convertNode(root.left);
		}
		//�����ڵ���ǰ��ڵ�����
		cur.left = lasNodeInList;
		if(lasNodeInList!=null){
			lasNodeInList.right = cur;
		}
		lasNodeInList = cur;
		//�õ��Ҷ���
		if(cur.right != null){
			convertNode(cur.right);
		}
	}
}
