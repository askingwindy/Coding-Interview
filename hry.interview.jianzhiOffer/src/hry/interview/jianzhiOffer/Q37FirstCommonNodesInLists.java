package hry.interview.jianzhiOffer;

/**
 * 37�⣬����������غϵ�
 * �����ã�ջ��hash���Լ���ͨ�ĳ��Ȳ���㣨��ռ�ö���ռ䣬BEST��
 * @author RY
 *
 */
public class Q37FirstCommonNodesInLists {
	/**
	 * �ȵõ���������ĳ��ȣ�Ȼ��õ����Ȳ�k
	 * ������������k������ͬʱ��ǰ�ߣ���һ�������ĵ���ǽ��
	 * @param root1
	 * @param root2
	 * @return
	 */
	public ListNode findFirstCommonNode(ListNode root1, ListNode root2){
		if(root1==null || root2 == null){
			return null;
		}
		int len1 = getLen(root1);
		int len2 = getLen(root2);
		
		int diff = len2-len1;
		ListNode longer = root2;
		ListNode shorter = root1;
		
		if(len2 < len1){
			diff = len1 - len2;
			longer = root1;
			shorter = root2;
		}
		
		for(int i=0; i<diff; i++){
			longer = longer.next;
		}
		
		while(longer != null && shorter != null){
			if(longer == shorter){
				return longer;
			}
			longer = longer.next;
			shorter = shorter.next;
		}
		return null;
	}
	
	/**
	 * �õ�����ĳ���
	 * @param root
	 * @return
	 */
	private int getLen(ListNode root){
		ListNode head = root;
		int count = 0;
		while(head != null){
			head = head.next;
			++count;
		}
		return count;
	}
}
