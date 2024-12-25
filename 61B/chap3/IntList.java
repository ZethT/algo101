package chap3;

public class IntList {
    int first;
    IntList rest;
    public IntList(int f, IntList r) {
        first = f;
        rest = r;
    }

    public int size() {
        if (rest == null) return 1;
        return 1 + rest.size();
    }

    public int iterativeSize() {
        IntList p = this;
        int size = 0;
        while (p != null) {
            size++;
            p = p.rest;
        }
        return size;
    }

    public int get(int index) {
        if (index == 0) return first;
        return rest.get(index - 1);
    }

    public void addFirst(int x){
        if (rest == null) {
            rest = new IntList(first, null);
        } else {
            rest = new IntList(first, rest);
        }
        first = x;
    }
}
