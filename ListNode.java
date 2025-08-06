import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val){
        this.val=val;
    }
    ListNode(int val, ListNode next){
        this.val=val;
        this.next=next;
    }
}

class Solution{
    public ListNode creatLinkedList(int[] values){
        if(values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for(int i=1;i<values.length;i++){
            current.next=new ListNode(values[i]);
            current=current.next;
        }
        return head;
    }
    public List<Integer> printLinkedList(ListNode head){
        List<Integer> ans = new ArrayList<>();
        ListNode current = head;
        while(current!=null){
            ans.add(current.val);
            current = current.next;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] line1 = s.trim().split("[,\\s]+");
        int n = line1.length;
        int[] arr1 = new int[n];
        for(int i=1; i<n;i++){
            arr1[i] = Integer.parseInt(line1[i]);
        }
        Solution sol = new Solution();
        ListNode l1 = sol.creatLinkedList(arr1);
        System.out.println(sol.printLinkedList(l1));
        sc.close();
    }
}