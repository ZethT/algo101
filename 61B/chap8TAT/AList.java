package chap8;

/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    /** Creates an empty list. */
    private int[] list;
    private final int REFACTOR = 2;
    private int capacity;
    private int size;
    public AList() {
        size = 0;
        list = new int[100];
        capacity = 100;
    }
    private void resize(int s) {
        capacity = s;
        int [] newList = new int[s];
        System.arraycopy(list, 0, newList, 0, size);
        list = newList;
    }
    /** Inserts X into the back of the list. */
    public void addLast(int x) {
        if (size == list.length){
            resize(size * REFACTOR);
        }
        list[size] = x;
        size = size + 1;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        if (size == 0) {
            System.out.println("The list is empty.");
            return -1;
        }
        return list[size - 1];
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        if (size == 0) {
            System.out.println("The list is empty.");
            return -1;
        }
        if (i < 0 || i > 99) {
            System.out.println("Invalid index.");
            return -1;
        }
        return list[i];
    }

    /** Returns the number of items in the list. */
    public int size() {
        return size;
    }

    /** Deletes item from back of the list and
     * returns deleted item. */
    public int removeLast() {
        size = size - 1;
        if ((double) size / capacity < 0.1) {
            resize(capacity / REFACTOR);
        }
        return list[size];
    }
}