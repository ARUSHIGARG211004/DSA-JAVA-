public class LinkedList{
    public static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data=data;
            this.next=null;        
            
         }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    
    public void addFirst(int data){
        //step 1- Create a newNode;
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step 2- newNode.next=head
        newNode.next=head;//link
        //head=newNode
        head=newNode;
    }
    public void addLast(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        
    }
    public void add(int index, int data){
        if(index==0){
            addFirst(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        Node temp= head;
        int i=0;
        if(i<index-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        
        
    }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void deleteNthfromEnd(int n){
        //calculate size
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;//removefirst
            return;
        }
        //size-n
        int i=1;
        int iToFind=size-n;
        Node prev=head;
        while(i<iToFind){
            prev=prev.next;
            i++;
            
        }
        prev.next=prev.next.next;
        return;
        
    }
    public static void main(String[]args){
        LinkedList ll=new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.add(2,9);
        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();
    }
}