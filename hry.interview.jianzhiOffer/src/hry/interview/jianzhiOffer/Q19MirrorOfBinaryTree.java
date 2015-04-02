package hry.interview.jianzhiOffer;

/**
 * 19题，输出二叉树的镜像
 * @author RY
 *
 */
public class Q19MirrorOfBinaryTree {
    public BinaryTreeNode mirrorTree(BinaryTreeNode root) {
        if(root == null){
            return root;
        }
        
        return mirror(root);
    }
    
    private BinaryTreeNode mirror(BinaryTreeNode root){
    	if(root == null){
    		return root;
    	}
    	BinaryTreeNode mirror = new BinaryTreeNode(root.val);
    	mirror.left = mirror(root.right);
    	mirror.right = mirror(root.left);
    	return mirror;
    }
}
