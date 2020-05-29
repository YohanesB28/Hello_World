/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectCalculator;

public class ListNode {
    private String elemen;
    private ListNode next,prev;

    public ListNode(String elemen, ListNode next, ListNode prev) {
        this.elemen = elemen;
        this.next = next;
        this.prev = prev;
    }

    public ListNode(String elemen) {
        this.elemen = elemen;
    }

    public ListNode() {
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public String getElemen() {
        return elemen;
    }
}
