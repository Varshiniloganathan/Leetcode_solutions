class MyLinkedList {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    Node head;
    int len = 0;

    public MyLinkedList() {

    }

    public int get(int index) {
        if ( index < 0 || index >= len) {
            return -1;
        }
        Node curr = head;
        int i = 0;
        while (i < index) {
            curr = curr.next;
            i++;
        }
        return curr.val;

    }

    public void addAtHead(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            newnode.next = head;
            head = newnode;
        }
        len++;

    }

    public void addAtTail(int val) {
        Node newnode = new Node(val);
        if (head == null) {
            head = newnode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newnode;
        }
        len++;

    }

    public void addAtIndex(int index, int val) {
        if (len == index) {
            addAtTail(val);
        }
        else if(index == 0){
            addAtHead(val);
        }

        else if (index < len) {
            Node newnode = new Node(val);
            int i = 0;
            Node curr = head;
            while (i < index - 1) {
                curr = curr.next;
                i++;
            }
            newnode.next = curr.next;
            curr.next = newnode;
            len++;
        }

    }

    public void deleteAtIndex(int index) {
        if (index == 0 && head != null) {
            head = head.next;
            len--;
        } 
        else if (index < len) {
            int i = 0;
            Node prev = null;
            Node curr = head;
            
            while (i<index) {
                prev = curr;
                curr = curr.next;
                i++;
            }
            if(curr!=null){
                prev.next = curr.next;
            }
            else{
                prev.next = null;
            }
            
            len--;
        }

    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */