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
    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;
        
        while((fast!=null) && (fast.next!=null)){
            slow=slow.next;//+1
            fast=fast.next.next;//+2
             }
        return slow;//slow is my mid node;
    }
    
    public boolean checkpalindrom(){
        if(head==null || head.next==null){
            return true;
        }
        //step-1 find thr middle node;
        Node midNode= findMid(head);
        //step-2 reverse the 2nd half;
        Node prev=null;
        Node curr=midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        //step-3 check left half & right half
        Node right=prev;// right half head
        Node left=head;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
        
    }
   
    public static void main(String[]args){
        LinkedList ll=new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        // ll.add(2,9);
       ll.print();
       System.out.println(ll.checkpalindrom());
    
       
    }
}