class ListNode:
  def __init__(self,val=0):
    self.val=val
    self.next=None

def linebreak():
  print("##############")

def reverse(pre,next):
  last = pre.next
  curr = last.next
  while curr != next:
    last.next = curr.next
    curr.next = pre.next
    pre.next = curr
    curr = last.next
  return last

def reverseKGroup(head,k):
  if head is None or k ==1:
    return head
  fake = ListNode(0)
  fake.next = head
  pre = fake
  i = 0
  p = head
  while p is not None:
    i+=1
    if i%k == 0:
      pre = reverse(pre,p.next)
      p = pre.next
    else:
      p = p.next
  return fake.next

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
 
arr = [1,2,3,4,5]
l = insert(arr)
linebreak()
display(l)
linebreak()
display(reverseKGroup(l,2))
linebreak()