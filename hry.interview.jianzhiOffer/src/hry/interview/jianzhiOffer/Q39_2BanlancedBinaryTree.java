package hry.interview.jianzhiOffer;

/**
 * 39-2�⣬�ж�һ�����ǲ��Ƕ���ƽ����
 * ��ͨ��Leetcode��֤��https://leetcode.com/problems/balanced-binary-tree/
 * @author RY
 *
 */
public class Q39_2BanlancedBinaryTree {
    /**
     * ͨ���ҵ��������ĸ߶����ж�
     * @param root
     * @return
     */
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        return getDepth(root)!=-1;
    }
    private int getDepth(TreeNode root){
        if(root == null){
            return 0;
        }
        int left= getDepth(root.left);
        int right = getDepth(root.right);
        
        if(left ==-1 || right == -1 || Math.abs(left-right)>1){
            return -1;
        }
        return Math.max(left, right)+1;//WHY is max???
    }
}
