package hry.interview.jianzhiOffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 24题，二叉树的后序遍历
 * 已通过leetcode验证：https://leetcode.com/problems/binary-tree-postorder-traversal/
 * @author RY
 *
 */
public class Q24SequenceOfBST {
    /**
     * 有技巧的记住模板
     * @param root
     * @return
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> rst = new ArrayList<Integer>();
        if(root == null){
            return rst;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
        TreeNode pre = null;
        TreeNode cur = root;
        while(!stack.isEmpty()){
            cur = stack.peek();
            if(pre == null || pre.left == cur || pre.right == cur){
            	//如果第一次访问root节点，或者cur是pre的子节点
                if(cur.left != null){
                    stack.push(cur.left);
                }else if(cur.right != null){
                    stack.push(cur.right);
                }else{
                    stack.pop();
                    rst.add(cur.val);
                }
            }else if(cur.left == pre){
            	//访问完左儿子
                if(cur.right != null){
                    stack.push(cur.right);
                }else{
                    stack.pop();
                    rst.add(cur.val);
                }
            }else if(cur.right == pre){
            	//访问完右儿子
                    stack.pop();
                    rst.add(cur.val);
            }
            pre = cur;
        }
        return rst;
    }
}
