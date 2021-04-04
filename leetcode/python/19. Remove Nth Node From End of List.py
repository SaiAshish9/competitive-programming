class ListNode:
  
  def __init__(self,val=0):
    self.val=val
    self.next=None
  
class Main:

  def __init__(self):
    self.root = None

  def add(self,data):
    node = ListNode(data)
    if self.root is None:
      self.root = node
    else:
      temp = self.root
      while temp.next is not None:
        temp = temp.next
      temp.next = node
  
  def removeNthFromEnd(self,n):
    count = 0
    tmp = self.root
    while tmp is not None:
      tmp = tmp.next
      count+=1
    toDe = count - n
    parent = ListNode(0)
    parent.next = self.root
    second = parent
    while toDe > 0:
      second = second.next
      toDe -= 1
    second.next = second.next.next
    return parent.next
  
  def display(self):
    tmp = self.root
    while tmp is not None:
      print(tmp.val)
      tmp = tmp.next

arr = list(range(6))
m = Main()
for i in range(1,len(arr)):
  m.add(arr[i])
m.display()
y = m.removeNthFromEnd(2)
while y is not None:
  print(y.val)
  y = y.next









