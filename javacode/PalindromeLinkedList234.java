package javacode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList234 {

    public static class ListNode {
        public int val;
        public ListNode next;

        public ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        List<Integer> aux = new ArrayList<>();

        while (node1 != null) {
            aux.add(node1.val);
            node1 = node1.next;
        }

        int countStart = 0;
        int countEnd = aux.size() - 1;
        while (countStart <= countEnd) {

            if (aux.get(countStart) != aux.get(countEnd)) {
                System.out.println(false);
                ;
            }

            countStart++;
            countEnd--;
        }

        System.out.println(true);
        ;

    }

}
