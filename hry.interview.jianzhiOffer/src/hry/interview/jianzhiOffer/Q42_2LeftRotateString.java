package hry.interview.jianzhiOffer;

/**
 * 42-2Ìâ£¬×óÐý×Ö·û´®
 * @author RY
 *
 */
public class Q42_2LeftRotateString {
    /*
     * param A: A string
     * param offset: Rotate string with offset.
     * return: Rotated string.
     */
    public char[] rotateString(char[] A, int offset) {
        // wirte your code here
        if(A==null || A.length == 0||offset == 0){
            return A;
        }
        offset = offset%A.length;
        reverseParts(A, 0, A.length-1);
        reverseParts(A, 0, offset-1);
        reverseParts(A, offset, A.length-1);
        return A;
    }
    
    private void reverseParts(char[]A, int left, int right){
        if(left == right){
            return;
        }
        while(left < right){
            swap(A, left, right);
            left++;
            right--;
        }
    }
    private void swap(char[]A, int left, int right){
        char c = A[left];
        A[left] = A[right];
        A[right] = c;
    }
}
