package hry.interview.jianzhiOffer;

import java.util.ArrayList;
import java.util.List;

/**
 * 20题，顺时针打印矩阵
 * 已通过leetcode:https://leetcode.com/problems/spiral-matrix/
 * @author RY
 *
 */
public class Q20PrintMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return res;
        }
        helper(res, matrix, 0, matrix.length-1, 0, matrix[0].length-1);
        return res;
    }
    private void helper(List<Integer> res, int[][]matrix, int x1, int x2, int y1, int y2){
        if(x1 > x2 || y1 > y2){
            return ;
        }
        if(x1==x2 && y1==y2){
            res.add(matrix[x1][y1]);
        }else if(x1==x2 && y1 !=y2){
            for(int i=y1; i<=y2; i++){
                res.add(matrix[x1][i]);
            }
        }else if(x1 != x2 && y1==y2){
            for(int i=x1; i<=x2; i++){
                res.add(matrix[i][y1]);
            }
        }else{
            
            for(int j=y1; j<y2; j++){
                res.add(matrix[x1][j]);
            }
            for(int i=x1; i<x2; i++){
                res.add(matrix[i][y2]);
            }
            for(int j=y2; j>y1; j--){
                res.add(matrix[x2][j]);
            }
            for(int i=x2; i>x1; i--){
                res.add(matrix[i][y1]);
            }
            
            helper(res, matrix, x1+1, x2-1, y1+1, y2-1);
        }
    }
}
