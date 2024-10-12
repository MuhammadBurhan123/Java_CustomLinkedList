public class Node {
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }

    public void displayNode(){
        System.out.println("Node Data: " + this.data);
    }
}
