/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectCalculator;

/**
 *
 * @author admin
 */
public class LinkedList {

    private ListNode head;
    private int size;//menampung jumlah node

    public LinkedList() {
        head = new ListNode();
        head.setNext(head);
        head.setPrev(head);
        size = 0;
    }

    private ListNode addBefore(String elemen, ListNode temp) {
        ListNode baru = new ListNode(elemen);
        baru.setNext(temp);
        baru.setPrev(temp.getPrev());
        temp.getPrev().setNext(baru);
        temp.setPrev(baru);
        size++;
        return baru;
    }

     public void addLast(String elemen) {
        addBefore(elemen, head);
    }

    private String remove(ListNode hapus) {
        hapus.getPrev().setNext(hapus.getNext());
        hapus.getNext().setPrev(hapus.getPrev());
        size--;
        return hapus.getElemen();
    }

    public String removeFirst() {
        return remove(head.getNext());

    }

    public void display() {
        ListNode bantu = head.getNext();
        System.out.print("\nLinked List Saat ini = ");
        while (bantu != head) {
            System.out.print(bantu.getElemen() + " ");
            bantu = bantu.getNext();
        }
        System.out.println("\nBanyak Node = " + size + "\n");
    }

    public boolean isEmpty() {
        if (head.getNext() == null && head.getPrev() == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getSize() {
        return size;
    }
}
