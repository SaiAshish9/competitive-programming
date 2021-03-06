class Node:
  def __init__(self,data):
    self.data=data
    self.next=None
  
class LinkedList:
  def __init__(self):
    self.root = None

  def Count(self):
    x=0
    temp=self.root
    while temp is not None:
      x+=1
      temp=temp.next
    return x

  def add(self,data):
    node = Node(data)
    if self.root is None:
      self.root = node
    else:
      temp = self.root
      while temp.next is not None:
        temp= temp.next
      temp.next = node

  def display(self):
    temp = self.root
    while temp is not None:
      print(temp.data)
      temp = temp.next
  
  def sum(self,count):
    x = 0
    temp = self.root
    i = count - 1
    while i != -1:
      x += temp.data * pow(10,i)
      i-=1
      temp = temp.next 
    return x 


l1 = LinkedList()
l2 = LinkedList()
l1.add(2)
l1.add(4)
l1.add(3)
l2.add(5)
l2.add(6)
l2.add(4)
l1.display()
l2.display()
ans = l1.sum(l1.Count()) + l2.sum(l2.Count())
print(int(str(ans)[::-1]))

