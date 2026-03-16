// find rightmost non-9, add 1 for prev.val and replace all values after prev (prev.next) with 0

public static Node addOne(Node head) {
    //write your code here...
    Node curr = head;
    Node prev = null;
    while (curr.next != null) {
        if (curr.data != 9) {
            prev = curr;
        }
        curr = curr.next;
    }
    if (curr.data != 9) {
        curr.data += 1;
        return head;
    }

    if (prev == null) {
        Node newNode = new Node(1);
        newNode.next = head;
        curr = newNode.next;
        head = newNode;
    }
    else {
        prev.data += 1;
        curr = prev.next;
    }
    while (curr != null) {
        curr.data = 0;
        curr = curr.next;
    }
    return head;
}