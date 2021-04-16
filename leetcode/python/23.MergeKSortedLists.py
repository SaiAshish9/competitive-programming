class PriorityQueue(object):

  def __init__(self):
    self.queue = []

  def __str__(self):
    return str(self.queue)

  def insert(self,data):
    d = []
    for i in data:
      d.extend(ListNode.fetchValues(i))
    # *ListNode.fetchValues(i)
    self.queue += d
    self.queue = sorted(self.queue)

class ListNode():
  def __init__(self,val):
    self.val=val
    self.next=None
  
  @staticmethod 
  def fetchValues(t):
    res=[]
    temp=t
    while temp is not None:
      res.append(temp.val)
      temp = temp.next
    return res

  @staticmethod
  def display(t):
    temp = t
    while temp is not None:
      print(temp.val)
      temp = temp.next
  
  @staticmethod
  def insert(list):
    root= None
    head= None
    for i in range(len(list)):
      if i==0:
        root = ListNode(list[i])
        head = root
      else:
        root.next = ListNode(list[i])
        root = root.next
    return head

def lineBreak():
  print("###############")

l1 = ListNode.insert([3,4,1])
l2 = ListNode.insert([5,6,1])
lineBreak()
ListNode.display(l1)
lineBreak()
ListNode.display(l2)
lineBreak()
q = PriorityQueue()
q.insert([l1,l2])
print(q)