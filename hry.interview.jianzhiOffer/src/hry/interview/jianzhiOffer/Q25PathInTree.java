package hry.interview.jianzhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 25�⣬�������к�Ϊĳһֵ��·��
 * ��ͨ��leetcode��֤��https://leetcode.com/problems/path-sum-ii/
 * @author RY
 *
 */
public class Q25PathInTree {
    /**
     * ����ǰ����ҵķ����õ�rst����Ҫע����ǣ�
     * ʲôʱ��rst�����ֵ������ӵ�result��
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
