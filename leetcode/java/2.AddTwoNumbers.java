// import java.lang.*;

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
        Node p = root;
        while(p!=null){
            count++;
            p = p.next;
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

    public int sum(int count){
        int x =0;
        Node p = root;
        if(p != null){
            for(double i=count-1;i>=0;i--){
                x += (int)(p.data * Math.pow(10,i)) ;
                p = p.next;
            }
            return x;
        }else{
            return 0;
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
        int count1 = l1.getCount();
        int count2 = l2.getCount();
        int sum = l1.sum(count1) + l2.sum(count2);
        int n= sum;
        int res=0;
        while(n>1){
            res= res*10+ n%10;
            n/=10;
        }
        System.out.println("Answer: "+ res);
    }

}