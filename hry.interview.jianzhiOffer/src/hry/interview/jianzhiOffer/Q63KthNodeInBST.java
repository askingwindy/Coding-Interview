package hry.interview.jianzhiOffer;

/**
 * 找到二叉树中第k大的节点
 * @author RY
 *
 */
public class Q63KthNodeInBST {
	/**
	 * 利用中序遍历
	 * @param root
	 * @param k
	 * @return
	 */
	private int kth = 0;
	public BinaryTreeNode kthNode(BinaryTreeNode root, int k){
		if(root == null || k==0){
			return null;
		}
		kth = k;
		return findKthNode(root);
	}
	/**
	 * 中序遍历核心
	 * NOTE:
	 *  递归时，k的值需要：访问到一个节点时递减
	 *  那么k应该是一个全局的变量，而不是局部的变量
	 * @param root
	 * @param k
	 * @return
	 */
	private BinaryTreeNode findKthNode(BinaryTreeNode root){
		BinaryTreeNode target = null;
		if(root.left != null){
			target = findKthNode(root.left);
		}
		if(target == null){
			if(kth==1){
				target = root;
			}
			kth--;
		}
		if(target == null && root.right != null){
			target = findKthNode(root.right);
		}
		return target;
	}
}
