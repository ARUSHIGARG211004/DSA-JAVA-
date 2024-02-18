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
public void zigzag(){
    //find mid
    Node slow= head;
    Node fast= head.next;
    while(fast!=null && fast.next!=null){
        slow= slow.next;
        fast= fast.next.next;
    }
    Node mid=slow;
    
    // reverse 2nd half
    Node curr= mid.next;
    mid.next= null;
    Node prev= null;
    Node next;
    
    while(curr!= null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
    }
    
    Node left= head;
    Node right= prev;
    Node nextL, nextR;
    
    //alt merge- zig-zig game
    while(left!=null && right!=null){
        nextL=left.next;
        left.next= right;
        nextR= right.next;
        right.next=nextL;
        
        left=nextL;
        right=nextR;
    }
}
    public static void main(String[]args){
        LinkedList ll=new LinkedList();
       
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        ll.zigzag();
        ll.print();
    }
}