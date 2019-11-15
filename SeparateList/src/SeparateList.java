/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */

 class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
  }

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode beforeStar=new ListNode(0);
        ListNode beforeEnd=beforeStar;
        ListNode afterStar=new ListNode(0);
        ListNode afterEnd=afterStar;
        while(head!=null) {
            if(head.val<x) {
                beforeEnd.next=head;
                beforeEnd=beforeEnd.next;
            }else {
                afterEnd.next=head;
                afterEnd=afterEnd.next;
            }
            head=head.next;
        }
        afterEnd.next=null;
        beforeEnd.next=afterStar.next;
        return beforeStar.next;
    }
}
public class SeparateList {
}
