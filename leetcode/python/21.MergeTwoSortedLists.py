class Node:
  def __init__(self,data):
    self.data=data
    self.next=None
  
class LinkedList:
  def __init__(self):
    self.root = None

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
    print("############")
  
  @staticmethod
  def mergeTwoLists(l1,l2):
    l3 = Node(-1)
    node = l3
    while l1 is not None and l2 is not None:
      if l1.data < l2.data:
        node.next = l1
        l1=l1.next
        node = node.next
      else:
        node.next = l2
        l2 = l2.next
        node = node.next
    if l1 is not None:
      node.next = l1
    else:
      node.next = l2
    return l3.next


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
ans = LinkedList.mergeTwoLists(l1.root,l2.root)
while ans is not None:
  print(ans.data)
  ans = ans.next