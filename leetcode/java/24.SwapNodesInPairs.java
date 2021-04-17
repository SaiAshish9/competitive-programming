import java.util.*;
import java.util.stream.*;

class ListNode{
  int val;
  ListNode next;
  ListNode(){}
  ListNode(int val){this.val=val;}
  ListNode(int val,ListNode next){
    this.val=val;
    this.next=next;
  }
}

class Main{
  
  public static ListNode swapPairs(ListNode head){
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode node = fakeHead;
        while (node!=null & node.next != null && node.next.next!= null){
            ListNode first = node;
            ListNode second = node.next;
            ListNode third = node.next.next;
            first.next = third;
            second.next = third.next;
            third.next = second;
            node = second;
        }
        return fakeHead.next;
  }

  public static void display(ListNode node){
    ListNode temp = new ListNode();
    temp = node;
    while(temp!=null){
      System.out.println(temp.val);
      temp = temp.next;
    }
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

  public static void linebreak(){
    System.out.println("#############");
  }

  public static void main(String ...s){
    int[] arr = {1,2,3,4};
    List<Integer> list= Arrays.stream(arr).boxed().collect(Collectors.toList());
    ListNode l = insert(list);
    linebreak();
    display(l);
    ListNode res = swapPairs(l);
    linebreak();
    display(res);
    linebreak();
  }

}