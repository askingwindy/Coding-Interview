package hry.interview.jianzhiOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 按照之字形打印二叉树
 * 已通过leetcode验证：https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 * @author RY
 *
 */
public class Q61PrintTreesInZigzag {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int level=1;
        while(!queue.isEmpty()){
            List<Integer> rst = new ArrayList<Integer>();
            int size = queue.size();
            for(int i=0; i<size; i++){
                TreeNode cur = queue.poll();
                rst.add(cur.val);
                if(cur.left != null){
                    queue.offer(cur.left);
                }
                if(cur.right != null){
                    queue.offer(cur.right);
                }
            }
            if((level&0x01) == 0){
                Collections.reverse(rst);
            }
            level+= 1;
            result.add(rst);
        }
        return result;
    }
}
