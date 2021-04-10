function ListNode(val) {
    this.val = val;
    this.next = null;
}

var mergeTwoLists = function(l1, l2) {
    let dummyHead = new ListNode(0);
    let currentNode = dummyHead; 
    while(l1 !== null && l2 !== null){
        if(l1.val < l2.val){
            currentNode.next = l1;
            l1 = l1.next
        } else {
            currentNode.next = l2
            l2 = l2.next
        }
        currentNode = currentNode.next
    }
    if(l1 !== null) {
        currentNode.next = l1;
    } else if (l2 !== null) {
        currentNode.next = l2
    }
    return dummyHead.next
}

const x1= [1,2,4]
const x2= [1,3,4]

let l1,l2,temp       

x1.forEach((x,i)=>{
     if(l1==null){
       l1 = new ListNode(x)
     }else{
       temp = l1
       while(temp.next!=null){
         temp = temp.next
       }
       temp.next = new ListNode(x)
     }
})

x2.forEach((x,i)=>{
     if(l2==null){
       l2 = new ListNode(x)
     }else{
       temp=l2
       while(temp.next!=null){
         temp = temp.next
       }
       temp.next = new ListNode(x)
     }
})

function display(l){
  var temp = l
  if(temp==null){
    return
  }
  while(temp != null){
   console.log(temp.val)
   temp = temp.next
  }
  console.log("###########################")
}

display(l1)
display(l2)

var l3 = mergeTwoLists(l1,l2)

display(l3)