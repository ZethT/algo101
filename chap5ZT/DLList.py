class Node:
    def __init__(self ,value=None):
        self.value = value
        self.prev = None
        self.next = None
        
class DLList:
    def __init__(self):
        self.sentinel = Node()
        self.sentinel.prev = self.sentinel # tail
        self.sentinel.next = self.sentinel # head
        self.size = 0
    def addLast(self, value):
        newNode = Node(value)
        newNode.prev = self.sentinel.prev # point newNode.prev to tail
        if (self.size() == 0):
            self.sentinel.next = newNode # point head to newNode if it is the first node
        newNode.next = self.sentinel.next # point newNode.next to head
        self.sentinel.prev.next = newNode
        self.sentinel.prev = newNode

    def removeLast(self):
        tail = self.sentinel.prev   
        self.sentinel.prev = tail.prev # update new tail
        self.sentinel.prev.next = self.sentinel.next # move new tail'next to the head
        self.size -= 1
    def size(self):
        return self.size
    
