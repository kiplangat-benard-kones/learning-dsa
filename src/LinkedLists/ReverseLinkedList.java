/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedLists;

/** https://www.youtube.com/watch?v=RF_M9tX4Eag 
 *
 * @author bkones
 */
public class ReverseLinkedList {

    public static void main(String[] args) {
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;

        return head;

    }
}

/**
 * Definition for singly-linked list.*
 */
class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
