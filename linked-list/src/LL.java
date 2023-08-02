import java.security.spec.RSAOtherPrimeInfo;

public class LL {
    // this is the code to add first element last element delete first delete last  and display

    Node head;

    private int size=0;
    class Node {
        String data;
        Node next ;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }

    // add first
    public void addFirst(String data){
        Node newNode=new Node(data);
        if(head==null){         //if link is empty
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    // add last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node h=head;
        while(h.next!=null){
            h=h.next;
        }
        h.next=newNode;
       // newNode.next=null;  yeh to already point kr rha hai
    }

    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node h=head;
        while(h!=null){
            System.out.print(h.data+" -> ");
            h=h.next;
        }
        System.out.println("NULL");
    }

    //delete first

    public void deleteFist(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;   //fist node.next=head
    }

    public void deleteLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast= head;
        Node last=head.next;
        while(last.next!=null){
            last=last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }

    public int getSize(){
        return size;
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addLast("list");
        list.addFirst("This");
        list.display();
        System.out.println(list.getSize());
        list.deleteFist();
        list.display();
        System.out.println(list.getSize());
        list.deleteLast();
        list.display();
        System.out.println(list.getSize());

    }
}
