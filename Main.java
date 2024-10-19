
class Main{
    public static void main(String[] args) {

         LinkList list = new LinkList();

         System.out.println("Added 4,5,6 to end of list");
         list.addLast(4);
         list.addLast(5);
         list.addLast(6);
         list.display();
         
         System.out.println("Added 0,1,2,3 to start of list");
         list.addFirst(3);
         list.addFirst(2);
         list.addFirst(1);
         list.addFirst(0);
         list.display();
         
         System.out.println("Delete first item");
         list.deleteFirst();
         list.display();
         
         System.out.println("Delete first item");
         list.deleteLast();
         list.display();

         System.out.println("Delete middle");
         list.deleteMiddle();
         list.display();

        System.out.println("Add middle");
         list.addMiddle(7);
         list.display();
         
    }
}