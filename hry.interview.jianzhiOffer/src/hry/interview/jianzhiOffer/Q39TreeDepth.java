package hry.interview.jianzhiOffer;

/**
 * 39-1题，求二叉树最大深度
 * 已通过leetcode验证：https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * @author RY
 *
 */
public class Q39TreeDepth {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left, right)+1;
    }
}
