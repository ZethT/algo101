class Walrus:
    def __init__(self, weight: int, tuskSize: int):
        self.weight = weight
        self.tuskSize = tuskSize

if __name__ == "__main__":
    def doStuff(walrus: Walrus, x: int):
        walrus.weight = walrus.weight - 100
        x = x - 5

    walrus = Walrus(3500, 10.5)
    x = 9

    doStuff(walrus, x)
    print(walrus.weight)
    print(x)