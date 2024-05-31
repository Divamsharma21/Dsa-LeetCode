/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while (temp1 != null) {
            arr.add(temp1.val);

            temp1 = temp1.next;

        }

        while (temp2 != null) {
            arr.add(temp2.val);

            temp2 = temp2.next;

        }

        Collections.sort(arr);

        ListNode head = convertArrayToLinkedlist(arr);
        return head;

    }

    public ListNode convertArrayToLinkedlist(ArrayList<Integer> arr) {

        // as the head of the linked list
        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        for (int i = 0; i < arr.size(); i++) {
            // Create a new node with the array element
            temp.next = new ListNode(arr.get(i));
            // Move the temporary pointer to the newly created node
            temp = temp.next;
        }
        // Return the linked list starting
        // from the next of the dummy node
        return dummyNode.next;
    }
}