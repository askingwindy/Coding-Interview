package hry.interview.jianzhiOffer;

/**
 * 66�⣬����matrix�ҵ����string�Ƿ����
 * leetcode:https://leetcode.com/problems/word-search/
 * @author RY
 *
 */
public class Q66StringPathInMatrix {
    /**
     * �ص�������һ��used���飬���ʲô�ط����ù�
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
     * ע��ݹ������
     * 
     * @param board
     * @param word
     * @param used
     * @param index word�����ڵ��ַ�λ��
     * @param i board��λ��i
     * @param j board��λ��j
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
