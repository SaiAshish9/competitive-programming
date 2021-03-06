class Node{
    constructor(data){
       this.data = data
       this.next=null
    }
  }
  
  class LinkedList{
     
  
     constructor(){
       this.head = null
     }
  
     add(data){
       let node = new Node(data)
       if(this.head == null){
         this.head = node
       }else{
         let temp= this.head
         while(temp.next){
           temp=temp.next
         }
         temp.next=node
       }
     }
  
     Count(){
       var count=0
       let node = this.head;
       while(node!=null){
         count+=1
         node = node.next
       }
       return count
     }
  
     sum(count){
        let x=0;
        let temp = this.head;
        for(let i=count-1;i>=0;i--){
          x += temp.data * Math.pow(10,i) 
          temp=temp.next
        }
        return x
     }
  
     display(){
        let temp = this.head 
        while(temp != null){
          console.log(temp.data)
          temp = temp.next
        }
     }
  }
  
  var l1 = new LinkedList()
  var l2 = new LinkedList()
  
  l1.add(2)
  l1.add(4)
  l1.add(3)
  l2.add(5)
  l2.add(6)
  l2.add(4)
  l1.display()
  l2.display()
   
  var sum = l1.sum(l1.Count()) + l2.sum(l2.Count())
  
  console.log(parseInt(String(sum).split("").reverse().join("")))
  
  
  
  
  
  
  