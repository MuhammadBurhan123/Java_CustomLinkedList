public class LinkList {
    private Node head;

    public LinkList() {
        this.head = null;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }else{
            Node current = head;
            while (current.next != null) { 
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }else{
            Node temp = head;
            head = newNode;
            head.next = temp;
        }
    }
    public void deleteFirst(){
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
        }
    }

    public void deleteLast(){
        if (head == null) {
            System.out.println("List is empty");
        } else {
            Node current = head;
            while (current.next.next != null) { 
                current = current.next;
            }
            current.next = null;
        }
    }


    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
