class IntList:
    def __init__(self, f: int, r: 'IntList'):
        self.first = f
        self.rest = r
    def size(self) -> int:
        if self.rest is None:
            return 1
        return 1 + self.rest.size()
    def iterativeSize(self) -> int:
        p = self
        size = 0
        while p is not None:
            size += 1
            p = p.rest
        return size
    def get(self, i: int) -> int:
        if i == 0:
            return self.first
        return self.rest.get(i - 1)
    

if __name__ == "__main__":
    L = IntList(5, None)
    L = IntList(10, L)
    L = IntList(15, L)
    print(L.size())
    print(L.iterativeSize())
    print(L.get(2))
    print(L.get(1))
    print(L.get(0))