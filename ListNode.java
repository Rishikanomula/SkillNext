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

    //To reverse linked-list
    public ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }

    //To check if LL is palindrome 
    public boolean isPalindrome(ListNode head){
        if(head == null || head.next == null) return true;
        ListNode slow = head, fast = head;
        while(fast!= null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalf = reverseList(slow);
        ListNode p1 = head;
        ListNode p2 = secondHalf;
        boolean isPalin = true;
        while(p2!=null){
            if(p1.val != p2.val){
                isPalin = false;
                break;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return isPalin;
    }
// swap nodes in pairs
    public ListNode swapPairs(ListNode head){
        if(head!=null || head.next!=null) return head;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode curr = head;
        ListNode prev = dummy;
        while(curr!=null && curr.next!=null){
            ListNode first = curr;
            ListNode sec = curr.next;
            prev.next=first.next;
            sec.next=first;
            prev=first;
            curr=first.next;
        }
        return dummy.next;
    }

//remove nth node from end
    public ListNode removeNthfFromEnd(ListNode head, int n){
        ListNode dum = new ListNode(0);
        dum.next=head;
        ListNode f = dum;
        ListNode s = dum;
        for(int i=0; i<n; i++){
            f=f.next;
        }
        while(f.next!=null){
            s=s.next;
            f=f.next;
        }
        s.next = s.next.next;
        return dum.next;
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