public class Insert {
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
        Node h=head;
        while(h.next!=null){
            h=h.next;
        }

        h.next=newNode;
    }

    void print(){
        Node h=head;
        while(h!=null){
            System.out.print(h.data+" ");
            h=h.next;
        }
        System.out.println();
    }

    void insertNode(int data,int pos){
      Node newNode=new Node(data);
      if(pos==0){
          newNode.next=head;
          head=newNode;
          return;
      }
      int currentPos=0;
      Node curr=head;

      while(curr!=null&&currentPos<pos-1){

          currentPos++;
          curr=curr.next;
      }
      if(curr==null){
          System.out.println("Position is not in the array");
          return;
      }
      newNode.next=curr.next;
      curr.next=newNode;
    }


    public static void main(String[] args) {
        Insert list=new Insert();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.insertNode(0,0);
        list.insertNode(5,3);
        list.print();
    }
}
