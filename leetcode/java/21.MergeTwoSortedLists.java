import java.util.*;
import java.util.stream.Collectors;

class ListNode{
  int val;
  ListNode next;
  ListNode(){}
  ListNode(int val){
    this.val = val;
  }
  ListNode(int val,ListNode next){
    this.val=val;
    this.next=next;
  }
}

class Main{
  
  public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
    ListNode l3= new ListNode(-1);
    ListNode node = l3;
    while(l1 !=null && l2 != null){
          if(l1.val<l2.val){
            node.next = l1;
            l1 = l1.next;
            node = node.next;
          }else{
            node.next = l2;
            l2 = l2.next;
            node = node.next;
          }
    }
    if(l1 != null){
      node.next = l1;
    }else if(l2!=null){
      node.next = l2;
    }
    return l3.next;
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

  public static void display(ListNode l){
      ListNode temp = new ListNode();
      temp = l;
      System.out.println("#############");
      while(temp!=null){
        System.out.println(temp.val);
        temp=temp.next;
      }
      System.out.println("#############");
  }

  public static void main(String ...s){
    int arr1[] = {1,2,4};
    int arr2[] = {1,3,4};
    List<Integer> list1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
    List<Integer> list2 = Arrays.stream(arr2).boxed().collect(Collectors.toList());
    ListNode l1 = insert(list1);
    ListNode l2 = insert(list2);
    display(l1);
    display(l2);
    ListNode res = mergeTwoLists(l1,l2);
    display(res);
  }
}