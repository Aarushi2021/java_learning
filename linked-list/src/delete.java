import java.util.LinkedList;

public class delete {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    void append(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;

    }

    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }


    void delete(int pos){
        pos=pos-1;
        if(head==null){// for blank list
            return;
        }
        Node temp=head;
        if(pos==0){
            head=temp.next; //for deleting first element head needs to be removed
            return;
        }
        for(int i=0;temp!=null&&i<pos-1;i++){          //pos-2 (1 based indexing )
            temp=temp.next;
        }
        if(temp==null||temp.next==null){
            return;   //if position is more
        }
        Node nex=temp.next.next;
        temp.next=nex;

    }

    public static void main(String[] args) {

        delete list=new delete();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        list.display();
        list.delete(3);
        list.display();
    }
}
