public class MiddleAdd {
Node head;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next=null;
    }
}
void display(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    System.out.println();
}

 void append(int data){
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
 }

 //finding middle the insert
 void insertMiddle(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
    }
    else{
        Node h=head;
        int length=0;
        while(h!=null){
            length++;
            h=h.next;
        }
        int mid=length/2;
        h=head;
        for(int i=0;i<mid-1;i++){
            h=h.next;
        }
        newNode.next=h.next;
        h.next=newNode;
    }
 }

 // fast and slow pointer fast will traverse whole and slow will traverse half
 void insert(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    Node fast=head;
    Node slow=head;
    Node prev=null;
    while(fast!=null&& fast.next!=null){
        fast=fast.next.next;
        prev=slow;
        slow=slow.next;
    }
    newNode.next=prev.next;
    prev.next=newNode;
 }



    public static void main(String[] args) {
        MiddleAdd list=new MiddleAdd();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.display();
        list.insertMiddle(5);

        list.display();
    }
    }


