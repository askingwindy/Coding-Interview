package hry.interview.jianzhiOffer;
/**
 * 计算二叉树两个节点的最低公共父节点
 * 已经通过lintcode测试：http://lintcode.com/en/problem/lowest-common-ancestor/#
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
			 //表明这个root下恰好这两个节点
			 return root;
		 }else if(left != null){
			 //表明两个节点都在left分支上
			 return left;
		 }else if(right != null){
			 //表明两个节点都在right分支上
			 return right;
		 }else{
			 //没有存在
			 return null;
		 }
	 }
}
