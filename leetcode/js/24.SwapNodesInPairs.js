class ListNode{
    constructor(val=0){
      this.val = val
      this.next = null
    }
  }
  
  function linebreak(){
    console.log("##################")
  }
  
  function swapPairs(head){
    var fakeHead = new ListNode(-1)
    fakeHead.next = head
    var node = fakeHead
    while(node.next != null){
     let first = node
     let second = node.next
     let third = node.next.next
     first.next = third
     second.next = third.next
     third.next = second
     node = second
    }
    return fakeHead.next
  }
  
  function display(node){
    let temp = new ListNode()
    temp = node
    while(temp != null){
      console.log(temp.val)
      temp = temp.next
    }
  }
  
  function insert(l){
    var root = new ListNode()
    for(let i in l){
      let data = new ListNode(l[i])
      if(i==0){
        root = data
      }else{
        let temp = new ListNode()
        temp = root
        while(temp.next != null){
          temp = temp.next
        }
        temp.next = data
      }
    }
    return root
  }
  
  const arr = [1,2,3,4]
  let l = insert(arr)
  linebreak()
  display(l)
  linebreak()
  display(swapPairs(l))
  linebreak()