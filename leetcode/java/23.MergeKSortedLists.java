import java.util.*;

class ListNode{
  int val;
  ListNode next;
  ListNode(){}
  ListNode(int val){
    this.val = val;
  }
  ListNode(int val,ListNode next){
    this.val = val;
    this.next = next;
  }
}

class Main{
  public static ListNode mergekLists(ListNode[] lists){
        PriorityQueue<ListNode> q = new PriorityQueue<ListNode>(Math.max(1,lists.length), new Comparator<ListNode>() {
            @Override
            public int compare(ListNode e1, ListNode e2) {
                return e1.val - e2.val;
            }
        });
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                q.add(lists[i]);
            }
        }
        // Iterator i = q.iterator();
        // while(i.hasNext()){
        //   display((ListNode)i.next());
        // }
        ListNode fakeHead = new ListNode(-1);
        ListNode p = fakeHead;
        while (!q.isEmpty()) {
            ListNode n = q.poll();
            if (n.next != null) {
                q.add(n.next);
            }
            n.next = null;
            p.next = n;
            p = n;
        }
        return fakeHead.next;
  }

  public static void lineBreak(){
    System.out.println("#####################");
  }

  public static void display(ListNode l){
    ListNode temp = l;
    while(temp!=null){
      System.out.println(temp.val);
      temp=temp.next;
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

  public static void main(String ...s){
    ListNode[] lists = new ListNode[2];
    List<Integer> list1 = Arrays.asList(1,4,5);
    List<Integer> list2 = Arrays.asList(1,3,4);
    lineBreak();
    ListNode l1 = insert(list1);
    ListNode l2 = insert(list2);
    lists[0] = l1;
    lists[1] = l2;
    //  list1.stream().forEach(x->{
    //  System.out.println(x);
    //  });
     display(l1);
     lineBreak();
     display(l2);
     lineBreak();
     ListNode res = mergekLists(lists);
     display(res);
     lineBreak();
  }

}