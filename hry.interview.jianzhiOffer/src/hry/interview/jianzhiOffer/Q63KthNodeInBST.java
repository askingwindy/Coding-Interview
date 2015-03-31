package hry.interview.jianzhiOffer;

/**
 * �ҵ��������е�k��Ľڵ�
 * @author RY
 *
 */
public class Q63KthNodeInBST {
	/**
	 * �����������
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
	 * �����������
	 * NOTE:
	 *  �ݹ�ʱ��k��ֵ��Ҫ�����ʵ�һ���ڵ�ʱ�ݼ�
	 *  ��ôkӦ����һ��ȫ�ֵı����������Ǿֲ��ı���
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
