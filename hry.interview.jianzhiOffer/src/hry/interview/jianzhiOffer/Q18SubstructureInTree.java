package hry.interview.jianzhiOffer;

/**
 * 18题，判断B树是否是A树的子树
 * @author RY
 *
 */
public class Q18SubstructureInTree {

	public boolean hasSubtree(BinaryTreeNode A, BinaryTreeNode B){
		if(A== null || B== null){
			return false;
		}
		boolean result = false;
		if(A.val == B.val){
			result = isSub(A, B);
		}
		if(!result&&A.left != null){
			result = isSub(A.left, B);
		}
		if(!result && A.right !=null){
			result = isSub(A.right, B);
		}
		
		return result;
	}
	
	private boolean isSub(BinaryTreeNode A, BinaryTreeNode B){
		if(B== null){
			return true;
		}else if(A==null){
			return false;
		}else if(A.val != B.val){
			return false;
		}
		return isSub(A.left, B.left) && isSub(A.right, B.right);
	}
}
