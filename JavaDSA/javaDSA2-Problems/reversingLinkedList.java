package javaDSA2;



class linkedList{
    static Node head;
    static int data;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data =d;
            next =null;
        }
}
/* function to reverse the linked list */
Node reverse(Node node){
    Node prev= null;
    Node current = node;
    Node next=null;


        while(current != null){
        next= current.next;
        current.next= prev;
        node.next= null;
        prev= current;
        current= next;
                     }
        node=prev;
        return node;
        }
  
void printList(Node node) {
    while (node != null) {
        System.out.print(node.data + " ");
        node = node.next;
    }
}
public static void main(String[] args) {
    linkedList list= new linkedList();
    list.head= new Node(85);
    list.head.next=  new Node(15);
    list.head.next.next= new Node(4);
    list.head.next.next.next= new Node(20);

    System.out.println("Given Linked List is :");
    list.printList(head);
    System.out.println(" ");
    head= list.reverse(head);
    System.out.println("Reversed linked list");
    list.printList(head);

    
}
}



