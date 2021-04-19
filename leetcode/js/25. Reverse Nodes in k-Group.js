class ListNode{
  constructor(val=0){
    this.val = val
    this.next = null
  }
}

function linebreak(){
  console.log("##################")
}

function reverse(pre,next){
  let last = pre.next
  let curr = last.next
  while(curr!=next){
    last.next = curr.next
    curr.next = pre.next
    pre.next = curr
    curr = last.next
  }
  return last
}

function reverseKGroup(head,k){
  if(head==null || k==1){
     return head
  }
  let fake = new ListNode(0)
  fake.next = head
  let pre = fake
  let i=0
  let p = head
  while(p!=null){
    i+=1
    if(i%k===0){
      pre = reverse(pre,p.next)
      p = pre.next
    }else{
      p = p.next
    }
  }
  return fake.next
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

const arr = [...Array(5).keys()].map(x=>x+1)
let l = insert(arr)
linebreak()
display(l)
linebreak()
display(reverseKGroup(l,2))
linebreak()