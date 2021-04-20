import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Main {

    static ListNode root;

    public  static ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode tmp = head;
        while(tmp != null){
            tmp = tmp.next;
            len ++;
        }
        int toDe = len - n;
        ListNode fake = new ListNode(-1);
        ListNode parent = fake;
        parent.next = head;
        while (toDe > 0){
            parent = parent.next;
            toDe --;
        }
        parent.next = parent.next.next;
        return fake.next;      
    }

    public static void display(){
      display(root);
    }

    public static void display(ListNode temp){
      while(temp.next != null){
        System.out.print(String.valueOf(temp.val) + (temp.next != null ?" -> ":""));
        temp =temp.next;
      }
      if(temp != root)
      System.out.print(String.valueOf(temp.val));
      System.out.print("\n");
    }

    public static void main(String ...s){
      int arr[] = {1,2,3,4,5};
      List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
      ListNode temp = new ListNode();
        for(int i=0;i<list.size();i++){
          if(list.size()==0){
             return;
          }else if(i==0){
             root = new ListNode(list.get(i)); 
          }else{
            temp = root;
            while(temp.next != null){
                  temp = temp.next;      
            }
            temp.next = new ListNode(list.get(i));
          } 
        }
      display(); 
      ListNode res = removeNthFromEnd(root,2);
      display(res);
    }
}