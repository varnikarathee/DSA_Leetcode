/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        if(head==null){
            return 0;
        }
        ListNode temp= head;
        ArrayList<Integer> list = new ArrayList<>();
        helper(temp,list);
        int y=0,z=list.size()-1;
        for(int i=0;i<list.size();i++){
            int x= list.get(i);
            y+=(x*Math.pow(2,z));
            z--;
        }
    
        return y;
    }
    public static ArrayList<Integer> helper(ListNode temp, ArrayList<Integer> list){
        
        list.add(temp.val);
        if(temp.next==null){
            return list;
        }
        return helper(temp.next,list);
        
    }
}