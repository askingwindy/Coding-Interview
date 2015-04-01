package hry.interview.jianzhiOffer;

/**
 * 在矩阵中找到target
 * 已通过Leetcode验证：https://leetcode.com/problems/search-a-2d-matrix/
 * @author RY
 *
 */
public class Q3FindInPartiallySortedMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0){
            return false;
        }
        int i = 0;
        int j = matrix[0].length -1;
        while(i<matrix.length && j >=0){
            int cur = matrix[i][j];
            if(cur > target){
                --j;
            }else if(cur < target){
                ++i;
            }else{
                return true;
            }
        }
        return false;
    }
}
