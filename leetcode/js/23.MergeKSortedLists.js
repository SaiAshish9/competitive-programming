class PriorityQueue{
  
    constructor(val){
      this.queue=[]
    }
  
    display(){
      console.log(this.queue)
    }
  
    insert(data){
     var d=[]
     for(let i in data){
       d.push(...ListNode.fetchValues(data[i]))
     }
     this.queue.push(...d)
     this.queue.sort((a,b)=>a-b)
    }
    
  }
  
  class ListNode{
  
    constructor(val=null){
      this.val = val
      this.next = null
    }
  
    static fetchValues(t){
      let res=[]
      let temp= t
      while(temp.next!=null){
        temp = temp.next
        res.push(temp.val)
      }
      return res
    }
  
    static insert(list){
      let root = new ListNode()
      var head = root
      for(let i in list){
        if(i===0){
          root = new ListNode(list[i])
          head = root
        }else{
          root.next = new ListNode(list[i])
          root = root.next
        }
      }
      return head
    }
  
    static display(list){
     let temp = list
     while(temp.next!=null){
      temp = temp.next
      console.log(temp.val)
     }
    }  
  }
  
  function linebreak(){
    console.log("##################")
  }
  
  const l1 = ListNode.insert([3,4,1]) 
  const l2 = ListNode.insert([5,6,1])
  linebreak()
  ListNode.display(l1)
  linebreak()
  ListNode.display(l2)
  linebreak()
  var q = new PriorityQueue()
  q.insert([l1,l2])
  q.display()