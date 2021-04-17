class ListNode:
  def __init__(self,val=0):
    self.val=val
    self.next=None

def linebreak():
  print("##############")

def swapPairs(head):
  fakeHead = ListNode(-1)
  fakeHead.next = head
  node = fakeHead
  while node.next is not None:
    first = node
    second = node.next
    third = node.next.next
    first.next = third
    second.next = third.next
    third.next = second
    node = second
  return fakeHead.next

def display(node):
  temp = ListNode()
  temp = node
  while temp is not None:
    print(temp.val)
    temp = temp.next

def insert(l):
  root = ListNode()
  for i in range(len(l)):
    data = ListNode(l[i])
    if i == 0:
      root =  data
    else:
      temp = ListNode()
      temp = root
      while temp.next is not None:
        temp = temp.next
      temp.next = data
  return root
 
arr = [1,2,3,4]
l = insert(arr)
linebreak()
display(l)
linebreak()
display(swapPairs(l))
linebreak()