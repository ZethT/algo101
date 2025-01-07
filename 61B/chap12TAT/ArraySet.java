package chap12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArraySet<T> {
    private T[] items;
    private int size;

    public ArraySet() {
        size = 0;
        items = (T[]) new Object[100];
    }

    public boolean contains(T x) {
        for (int i = 0; i < size; i += 1) {
            if (x.equals(items[i])) {
                return true;
            }
        }
        return false;
    }

    public void add(T x) {
        if (!this.contains(x)){
            items[size] = x;
            size = size + 1;
        }
        return;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        ArraySet<String> s = new ArraySet<>();
        s.add(null);
        s.add("horse");
        s.add("fish");
        System.out.println(s.size());
    }
}
