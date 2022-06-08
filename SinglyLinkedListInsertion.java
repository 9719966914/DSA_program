class Node{
    String name;
    Node next;
    Node(String name){
        this.name=name;
    }
}
public class SinglyLinkedListInsertion{
    Node head;
    public void PrintLinkedList(){
        Node temp = head;
        System.out.print("\n LinkedList is:- ");
        while(temp!=null){
            System.out.print(temp.name+" ");
            temp = temp.next;
        }
    }
    public void InsertAtBeg(String x){
        Node n = new Node(x);
        if(head==null){
            head = n;
        }
        else{
            n.next = head;
            head=n;
        }
    }
    public void InsertAtEnd(String x) {
        Node n = new Node(x);
        Node temp = head;
        if (head == null) {
            head = n;
        } else {
            while (temp.next!= null) {
                temp = temp.next;
            }
            temp.next = n;

        }
    }
    public int count(){
        Node temp = head;
        int c=0;
        while(temp!=null){
            c++;
            temp = temp.next;
        }
        return c;
    }
    public void InsertAtPos(int position,String x){
        Node n = new Node(x);
        if(head==null){
            if(position==1){
                head=n;
            }
            else{
                System.out.print("\nyou enter Invalid position because head is empty");
            }
        }
        else{
            if(position>count()+1){
                System.out.print("\nyou enter Invalid position ");
            }
            else{
                if(position==1){
                    n.next = head;
                    head=n;
                }
                else{
                    Node temp = head;
                    int c=1;
                    while(temp.next!=null){
                        if(c==position-1){
                            break;
                        }
                        c++;
                        temp=temp.next;
                    }

                    n.next = temp.next;
                    temp.next = n;


                }
            }
        }
    }
    public static void main(String []args){
        SinglyLinkedListInsertion ll = new SinglyLinkedListInsertion();
        ll.PrintLinkedList();
        ll.InsertAtBeg("shivam");
        ll.PrintLinkedList();
        ll.InsertAtBeg("parashar");
        ll.PrintLinkedList();
        ll.InsertAtEnd("pandit");
        ll.PrintLinkedList();
        ll.InsertAtPos(2,"shubham");
        ll.PrintLinkedList();
    }
}
