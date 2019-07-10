package me.syus.homework.algorithm;

import me.syus.homework.algorithm.support.LinkedListNode;

public class LinkedListCount {
    public int countLinkList(LinkedListNode head) {
        int count = 0;
        LinkedListNode curr = head;
        while (curr != null) {
            count++;
            curr = curr.next;

        }
        return count;
    }
    public LinkedListNode countMiddle(LinkedListNode head) {

        LinkedListNode curr = head;
        LinkedListNode mid = head;
        while (curr != null) {
            curr = curr.next.next;
            mid = mid.next;

        }
        return mid;
    }
    public static void main(String[] args) {
        LinkedListNode n1 = new LinkedListNode(5);
        LinkedListNode n2 = new LinkedListNode(4);
        n1.next = n2;
        LinkedListCount solution = new LinkedListCount();
        System.out.println(solution.countLinkList(n1));
    }
}
