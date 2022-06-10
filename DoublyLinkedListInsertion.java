import java.util.*;
class Node2{
    int data;
    Node2 next;
    Node2 prev;
    Node2(int data){
        this.data = data;
    }
}
public class DoublyLinkedListInsertion {
    Node2 head;
    public void print(){
        Node2 temp = head;
        System.out.print("\nDoubly Linked List is:- ");
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public void DoublyInsertAtBeg(int x){
        Node2 n = new Node2(x);
        if(head==null){
            head = n;
        }
        else{
            n.next = head;
            head.prev = n;
            head = n;

        }
    }
    public void DoublyInsertAtEnd(int x){
        Node2 n = new Node2(x);
        Node2 temp = head;
        if(head==null){
            head=n;
        }
        else{
            while(temp.next!=null){
                temp = temp.next;
            }
            n.prev = temp;
            temp.next = n;
        }
    }
    public static void main(String args[]) {
        DoublyLinkedListInsertion obj = new DoublyLinkedListInsertion();
        Node2 n1 = new Node2(5);
        Node2 n2 = new Node2(10);
        Node2 n3 = new Node2(15);
        obj.head = n1;
        n2.prev = n1;
        n1.next = n2;
        n3.prev = n2;
        n2.next = n3;
        obj.print();
        obj.DoublyInsertAtBeg(20);
        obj.print();
        obj.DoublyInsertAtEnd(50);
        obj.print();
    }
}
