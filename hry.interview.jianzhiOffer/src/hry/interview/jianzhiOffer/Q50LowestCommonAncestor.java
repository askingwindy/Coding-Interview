package hry.interview.jianzhiOffer;
/**
 * ��������������ڵ����͹������ڵ�
 * �Ѿ�ͨ��lintcode���ԣ�http://lintcode.com/en/problem/lowest-common-ancestor/#
 * @author RY
 *
 */
public class Q50LowestCommonAncestor {
	 public TreeNode lowestCommonAncestor(TreeNode root, TreeNode A, TreeNode B){
		 if(A==null || B==null){
			 return null;
		 }
		 return getAncestor(root, A, B);
	 }
	 
	 private TreeNode getAncestor(TreeNode root, TreeNode node1, TreeNode node2){
		 if(root==null || root==node1 || root == node2){
			 return root;
		 }
		 
		 TreeNode left = getAncestor(root.left, node1, node2);
		 TreeNode right = getAncestor(root.right, node1, node2);
		 
		 if(left != null && right != null){
			 //�������root��ǡ���������ڵ�
			 return root;
		 }else if(left != null){
			 //���������ڵ㶼��left��֧��
			 return left;
		 }else if(right != null){
			 //���������ڵ㶼��right��֧��
			 return right;
		 }else{
			 //û�д���
			 return null;
		 }
	 }
}
