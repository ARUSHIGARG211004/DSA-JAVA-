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
    
public void print(){
    Node temp= head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
}
public void add(int index, int data){
    if(index==0){
        addFirst(data);
        return;
    }
    Node newNode=new Node(data);
    size++;
    Node temp=head;
    int i=0;
    while(i<index-1){
        temp=temp.next;
        i++;
    }
    //i=index-1; temp-> prev;
    newNode.next=temp.next;
    temp.next=newNode;
    
}
    public static void main(String[]args){
        LinkedList ll=new LinkedList();
        // ll.print();
        ll.addFirst(2);
        // ll.print();
        ll.addFirst(1);
        // ll.print();
        ll.addLast(3);
        // ll.print();
        ll.addLast(4);
        ll.add(2,9);
        ll.print();
        System.out.print("the size of this LL is ");
        System.out.print(ll.size);
    }
}