package chap9;
import chap4.SLList;
public class Chap9 {
    public static int biggest(SLList list) {
        int max_index = 0;
        int max_number = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            int number = list.get(i);
            if (number > max_number) {
                max_number = number;
                max_index = i;
            }
        }
        return list.get(max_index);
    }
    public static void main(String[] args) {
        SLList list = new SLList();
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(1);
        System.out.println(biggest(list));
    }
}
