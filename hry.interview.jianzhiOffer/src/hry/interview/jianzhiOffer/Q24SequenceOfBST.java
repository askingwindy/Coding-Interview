package hry.interview.jianzhiOffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 24�⣬�������ĺ������
 * ��ͨ��leetcode��֤��https://leetcode.com/problems/binary-tree-postorder-traversal/
 * @author RY
 *
 */
public class Q24SequenceOfBST {
    /**
     * �м��ɵļ�סģ��
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
            	//�����һ�η���root�ڵ㣬����cur��pre���ӽڵ�
                if(cur.left != null){
                    stack.push(cur.left);
                }else if(cur.right != null){
                    stack.push(cur.right);
                }else{
                    stack.pop();
                    rst.add(cur.val);
                }
            }else if(cur.left == pre){
            	//�����������
                if(cur.right != null){
                    stack.push(cur.right);
                }else{
                    stack.pop();
                    rst.add(cur.val);
                }
            }else if(cur.right == pre){
            	//�������Ҷ���
                    stack.pop();
                    rst.add(cur.val);
            }
            pre = cur;
        }
        return rst;
    }
}
