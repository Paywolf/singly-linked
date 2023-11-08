public class SinglyLinkedList {
    private SinglyNode head;

    public SinglyLinkedList() {
        this.head = null;
    }

    public void reverse() {
        SinglyNode prev = null;
        SinglyNode curr = head;

        while (curr != null) {
            SinglyNode next = curr.getNext();
            curr.setNext(prev);

            prev = curr;
            curr = next;
        }

        head = prev;
    }
}