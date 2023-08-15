class Solution {
    public ListNode partition(ListNode head, int x) {
        if(head==null||head.next==null)return head;
        ListNode s=new ListNode();
        ListNode l=new ListNode();
        ListNode temp=head;
        ListNode ls=null;
        ListNode z=s;
        ListNode y=l;
        while(temp!=null){
            if(temp.val<x){
                ListNode zx=new ListNode(temp.val);
                s.next=zx;
                s=s.next;
                ls=zx;
            }
            else{
            ListNode zx=new ListNode(temp.val);
                l.next=zx;
                l=l.next;
            }
            temp=temp.next;
        }
        if(y.next!=null&&ls!=null)ls.next=y.next;
        return (z.next!=null)?z.next:head;
    }
}
