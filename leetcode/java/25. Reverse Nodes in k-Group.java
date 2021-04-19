import java.util.*;
import java.util.stream.*;

class ListNode{
  int val;
  ListNode next;
  ListNode(){}
  ListNode(int x){
   this.val=x;
  }
}

class Main{
  
  public static ListNode reverseKGroup(ListNode head, int k) 
  {
        if(head==null||k==1)
            return head;
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode pre = fake;
        int i=0;
        ListNode p = head;
        while(p!=null){
            i++;
            if(i%k==0){
                pre = reverse(pre, p.next);
                p = pre.next;
            }else{
                p = p.next; 
            }
        }
        return fake.next; 
  }

  public static ListNode insert(List<Integer> l){
  ListNode root = new ListNode();
  for(int i=0;i<l.size();i++){
    ListNode data = new ListNode(l.get(i));
    if(i==0){
      root = data;
    }else{
      ListNode temp = new ListNode();
      temp=root;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next= data;
    }
  }
  return root;
  }
   
  public static ListNode reverse(ListNode pre, ListNode next){
        ListNode last = pre.next;
        ListNode curr = last.next;
        while(curr != next){
            last.next = curr.next;
            curr.next = pre.next;
            pre.next = curr;
            curr = last.next;
        }
        return last; 
  }

  public static void display(ListNode root){
    ListNode temp = new ListNode();
    temp = root;
    while(temp!=null){
      System.out.println(temp.val);
      temp=temp.next;
    }
  }

  public static void linebreak(){
    System.out.println("#####################");
  }

  public static void main(String ...s){
     int[] arr = {1,2,3,4,5};
     List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
     ListNode l1= insert(list);
     linebreak();
     display(l1);
     linebreak();
     ListNode res = reverseKGroup(l1,2);
     display(res);
     linebreak();
  }
}