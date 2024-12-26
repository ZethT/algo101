package chap5;
public class DLList<T> {
    public class IntNode {
        public T item;
        public IntNode prev;
        public IntNode next;
        public IntNode(IntNode p, T i, IntNode n) {
            prev = p;
            item = i;
            next = n;
        }
    }
    private int size;
    private final IntNode sentinel;
    public DLList() {
        size = 0;
        sentinel = new IntNode(null, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
    }
    public DLList(T x) {
        size = 1;
        IntNode n = new IntNode(null, x, null);
        sentinel = new IntNode(null, null, null);
        n.next = sentinel;
        n.prev = sentinel;
        sentinel.prev = n;
        sentinel.next = n;
    }

    public void addLast(T x) {
        size = size + 1;
        IntNode n = new IntNode(sentinel.prev, x, sentinel);
        sentinel.prev.next = n;
        sentinel.prev = n;
    }

    public T getLast() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }
        return sentinel.prev.item;
    }

    public void removeLast() {
        if (size == 0) {
            throw new IllegalStateException("List is empty");
        }

        size = size - 1;
        IntNode remove = sentinel.prev;
        IntNode secondLast = sentinel.prev.prev;
        secondLast.next = sentinel;
        sentinel.prev = secondLast;
        remove.next = null;
        remove.prev = null;
    }

    public int size() {
        return size;
    }
    public void printList() {
        if (size == 0) {
            System.out.println("The list is empty.");
            return;
        }

        IntNode current = sentinel.next; // Start from the first node
        System.out.print("DLList: ");

        while (current != sentinel) { // Loop until back to the sentinel
            System.out.print(current.item + (current.next != sentinel ? " <-> " : ""));
            current = current.next; // Move to the next node
        }

        System.out.println(); // Newline after printing all elements
    }
    public static void main(String[] args) {
        DLList<Integer> list = new DLList<>();
        list.printList(); // Should print "The list is empty."

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);

        list.printList(); // Should print "DLList: 10 20 30"

        list.removeLast();
        list.printList(); // Should print "DLList: 10 20"
    }
}
