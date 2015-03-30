package hry.interview.jianzhiOffer;

/**
 * 判断一个树是否为镜像
 * 已通过Leetcode验证：https://leetcode.com/problems/symmetric-tree/
 * @author RY
 *
 */
public class Q59SymmetricalBinaryTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return sym(root.left, root.right);
    }
    
    private boolean sym(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }else if(left ==null || right == null){
            return false;
        }else if(left.val != right.val){
            return false;
        }
        return sym(left.left, right.right) && sym(left.right, right.left);
    }
}
