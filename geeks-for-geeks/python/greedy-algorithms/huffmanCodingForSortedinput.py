class QueueNode:
	
	def __init__(self, data = None, freq = None,
				left = None, right = None):
		self.data = data
		self.freq = freq
		self.left = left
		self.right = right

	def isLeaf(self):
		return (self.left == None and
				self.right == None)

class Queue:
	
	def __init__(self):
		self.queue = []

	def isSizeOne(self):
		return len(self.queue) == 1

	def isEmpty(self):
		return self.queue == []

	def enqueue(self, x):
		self.queue.append(x)

	def dequeue(self):
		return self.queue.pop(0)

def findMin(firstQueue, secondQueue):
	
	if secondQueue.isEmpty():
		return firstQueue.dequeue()

	if firstQueue.isEmpty():
		return secondQueue.dequeue()

	if (firstQueue.queue[0].freq <
		secondQueue.queue[0].freq):
		return firstQueue.dequeue()

	return secondQueue.dequeue()

def buildHuffmanTree(data, freq, size):
	
	firstQueue = Queue()
	secondQueue = Queue()

	for i in range(size):
		firstQueue.enqueue(QueueNode(data[i], freq[i]))

	while not (firstQueue.isEmpty() and
			secondQueue.isSizeOne()):
					
		left = findMin(firstQueue, secondQueue)
		right = findMin(firstQueue, secondQueue)

		top = QueueNode("$", left.freq + right.freq,
						left, right)
		secondQueue.enqueue(top)

	return secondQueue.dequeue()

def printCodes(root, arr):
	
	if root.left:
		arr.append(0)
		printCodes(root.left, arr)
		arr.pop(-1)

	if root.right:
		arr.append(1)
		printCodes(root.right, arr)
		arr.pop(-1)

	if root.isLeaf():
		print(f"{root.data}: ", end = "")
		for i in arr:
			print(i, end = "")
			
		print()

def HuffmanCodes(data, freq, size):
	root = buildHuffmanTree(data, freq, size)
	arr = []
	printCodes(root, arr)

arr = ["a", "b", "c", "d", "e", "f"]
freq = [5, 9, 12, 13, 16, 45]
size = len(arr)

HuffmanCodes(arr, freq, size)
