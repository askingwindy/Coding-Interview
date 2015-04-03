package hry.interview.jianzhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 25题，二叉树中和为某一值得路径
 * 已通过leetcode验证：https://leetcode.com/problems/path-sum-ii/
 * @author RY
 *
 */
public class Q25PathInTree {
    /**
     * 利用前序查找的方法得到rst，需要注意的是：
     * 什么时候rst里面的值可以添加到result中
     * @param root
     * @param sum
     * @return
     */
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null){
            return result;
        }
        List<Integer> rst = new ArrayList<Integer>();
        getPath(result, rst, sum, root);
        return result;
    }
    private void getPath(List<List<Integer>> result, List<Integer> rst, int sum, TreeNode root){
        if(root == null){
            return;
        }
        rst.add(root.val);
        if(root.val == sum && root.left ==null && root.right == null){
            result.add(new ArrayList<Integer>(rst));
            rst.remove(rst.size()-1);
            return;
        }
        getPath(result, rst, sum-root.val, root.left);
        getPath(result, rst, sum-root.val, root.right);
        rst.remove(rst.size()-1);
        
    }
}
