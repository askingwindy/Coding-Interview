package hry.interview.jianzhiOffer;

/**
 * 66题，根据matrix找到这个string是否存在
 * leetcode:https://leetcode.com/problems/word-search/
 * @author RY
 *
 */
public class Q66StringPathInMatrix {
    /**
     * 重点在利用一个used数组，标记什么地方已用过
     * @param board
     * @param word
     * @return
     */
    public boolean exist(char[][] board, String word) {
        if(board == null || board.length==0){
            return false;
        }
        if(word == null || word.length()==0){
            return true;
        }
        boolean[][]used = new boolean[board.length][board[0].length];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    if(search(board, word, used, 0, i, j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    /**
     * 注意递归的条件
     * 
     * @param board
     * @param word
     * @param used
     * @param index word中现在的字符位置
     * @param i board中位置i
     * @param j board中位置j
     * @return
     */
    private boolean search(char[][]board, String word, boolean[][]used, int index, int i, int j){
        if(index == word.length()){
            return true;
        }
        if(i<0||i>=board.length ||j<0|| j>=board[0].length){
            return false;
        }
        if(!used[i][j] && board[i][j] == word.charAt(index)){
            used[i][j] = true;
            if(search(board, word, used, index+1, i+1, j)||
                search(board, word, used, index+1, i, j+1)||
                search(board, word, used, index+1, i-1, j)||
                search(board, word, used, index+1, i, j-1)){
                return true;
            }else{
                used[i][j] = false;
            }
        }
        return false;
    }
}
