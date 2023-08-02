public class ReverseIterative {
    Node head;
    class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("Null");
    }

    void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node h=head;
        while(h.next!=null ){
            h=h.next;
        }
      h.next=newNode;
    }

     static  Node reverse(Node head){
   if(head==null||head.next==null){
       return head;
   }
   Node newHead=reverse(head.next);
         head.next.next=head;
         head.next=null;
return newHead;
    }
    public static void main(String[] args) {
        ReverseIterative list=new ReverseIterative();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.print();
        System.out.println();
      list.head= list.reverse(list.head);
        list.print();
    }
}
