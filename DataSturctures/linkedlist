class Node:
    def __init__(self, value=None, nextNode=None):
        self.value = value
        self.next = nextNode

class SLList:
    def __init__(self):  
        self.sentinel = Node()  
        self.size = 0
    
    def addHead(self, value):
        newNode = Node(value, self.sentinel.next)
        self.sentinel.next = newNode
        self.size += 1
    
    def addTail(self, value):
        self.size += 1
        node = self.sentinel
        while node.next is not None:
            node = node.next
        node.next = Node(value, None)
    
    def getSize(self):
        return self.size
    
    def getSizeRecursive(self, node: "Node" = None):
        if node is None:
            node = self.sentinel.next
        if node is None:
            return 0
        return 1 + self.getSizeRecursive(node.next)