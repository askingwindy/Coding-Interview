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
		//得到左儿子
		if(cur.left !=null){
			convertNode(root.left);
		}
		//将跟节点与前向节点连接
		cur.left = lasNodeInList;
		if(lasNodeInList!=null){
			lasNodeInList.right = cur;
		}
		lasNodeInList = cur;
		//得到右儿子
		if(cur.right != null){
			convertNode(cur.right);
		}
	}
}
