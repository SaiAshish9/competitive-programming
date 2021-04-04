class ListNode {
    constructor(val=0){ 
      this.val = val
      this.next = null
    }
  }
  
  class Main {
    
    constructor(){
      this.root=null
    }

    // static get root(){
    //   delete Main.root
    //   return Main.root
    // }

    // static set root(val){
    //   delete Main.root
    //   Main.root = val
    // }

    // get root(){
    //   delete this.root
    //   return this.root
    // }

    // set root(val){
    //   delete this.root
    //   this.root = val
    // }

    add(data){
         let node = new ListNode(data)
         if(this.root == null){
           this.root = node
         }else{
           let temp= this.root
           while(temp.next){
             temp=temp.next
           }
           temp.next=node
         }
       }
    
  
    removeNthFromEnd(n){
      var len = 0
      var tmp = this.root
      while (tmp != null) {
        tmp = tmp.next
        len++
      }
      var toDe = len - n
      var parent = new ListNode(0)
      parent.next = this.root
      var second = parent
      while (toDe > 0) {
        second = second.next
        toDe--
      }
      second.next = second.next.next
      return parent.next
    }
    
    display(temp=this.root){
      while(temp!=null){
        console.log(temp.val)
        temp=temp.next
      }
    }
  }
  
  const arr = [...Array(5).keys()].map(x=>x+1)
  
  var m = new Main()
   for (const i in arr) {
    m.add(arr[i])  
  }
  
  m.display()
  var y = m.removeNthFromEnd(2)
  
  while(y!=null){
    console.log(y.val)
    y=y.next
  }
  
  
  