public class DeleteMid {

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
        // fast and slow pointer fast will traverse whole and slow will traverse half
     void delete(){
            if (head==null){
                return;
            }
            Node fast=head,slow=head,prev=null;
            while(fast!=null&&fast.next!=null){
                fast=fast.next.next;
                  prev=slow;
                slow=slow.next;
            }
            prev.next=slow.next;
    }

        public static void main(String[] args) {
            DeleteMid list=new DeleteMid();
            list.append(1);
            list.append(2);
            list.append(3);
            list.append(4);
            list.display();
            list.delete();

            list.display();
        }
    }





