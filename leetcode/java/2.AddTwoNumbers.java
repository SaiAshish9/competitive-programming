class Node{
  int data;
  Node next;
  Node(int d){
   data = d;
   next = null;
  }
}

class Main {

  Node root;

  public void push(int data){
     Node node = new Node(data);
     if(root==null){
        root = node;
     }else{
       Node q = root;
       while(q.next != null){
         q=q.next;
       }
       q.next = node;
     }
  }

  public int getCount(){
    int count = 0;
    while(root!=null){
       count++;
       root = root.next;
    }
    return count;
  }
  
  public void display(){
    Node temp = root;
    while(temp!=null){
      System.out.print(temp.data + " ");
      System.out.println("");
      temp=temp.next;
    }
  }

  public static void main(String[] args) {
     Main l1= new Main();
     Main l2= new Main();
     l1.push(2);
     l1.push(4);
     l1.push(3);
     l2.push(5);
     l2.push(6);
     l2.push(4);
     l1.display();
     l2.display();
  }

}