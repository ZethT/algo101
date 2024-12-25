package chap4;

public class SLList {
    public static class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }
    private final IntNode sentinel;
    private int size;

    public SLList() {
        sentinel = new IntNode(-1, null);
        size = 0;
    }
    public SLList(int x) {
        sentinel = new IntNode(x, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size = size + 1;
    }

    public int getFirst() {
        return sentinel.next.item;
    }

    public void addLast(int x) {
        size = size + 1;

        IntNode p = sentinel;

        while (p.next != null) {
            p = p.next;
        }

        p.next = new IntNode(x, null);
    }

    private static int size(IntNode x) {
        if (x.next == null) {
            return 1;
        }
        return 1 + size(x.next);
    }
    public int size() {
        return size;
    }
}
