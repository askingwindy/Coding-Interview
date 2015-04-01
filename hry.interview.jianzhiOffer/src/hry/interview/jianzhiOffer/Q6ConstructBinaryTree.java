package hry.interview.jianzhiOffer;

import java.util.HashMap;
import java.util.Map;

/**
 * 第6题，从前序与中序构建新的二叉树
 * 已通过leetcode:https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * @author RY
 *
 */
public class Q6ConstructBinaryTree {
    /**
     * 利用递归
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder == null || inorder == null || preorder.length != inorder.length || preorder.length ==0 || inorder.length==0){
            return null;
        }
        Map<Integer, Integer> inorderMap = new HashMap<Integer, Integer>();
        for(int i =0; i<inorder.length; i++){
            inorderMap.put(inorder[i], i);
        }
        return getRoot(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1, inorderMap);
    }
    
    /**
     * 递归的主方法
     * @param preorder
     * @param preBegin
     * @param preEnd
     * @param inorder
     * @param inBegin
     * @param inEnd
     * @param inorderMap
     * @return
     */
    private TreeNode getRoot(int[]preorder, int preBegin, int preEnd, int[]inorder, int inBegin, int inEnd, Map<Integer, Integer> inorderMap){
        if(preBegin > preEnd){
            return null;
        }else if(preBegin == preEnd){
            return new TreeNode(preorder[preBegin]);
        }
        int cur = preorder[preBegin];
        TreeNode root = new TreeNode(cur);
        int inorderIndex = inorderMap.get(cur);
        int leftLength = inorderIndex - inBegin;
        int rightLength = inEnd - inorderIndex;
        root.left = getRoot(preorder, preBegin+1, preBegin+leftLength, inorder, inBegin, inorderIndex-1, inorderMap);
        root.right = getRoot(preorder, preEnd-rightLength+1, preEnd, inorder, inorderIndex+1, inEnd, inorderMap);
        return root;
    }
}
