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
    
    
    // public void addFirst(int data){
    //     //step 1- Create a newNode;
    //     Node newNode= new Node(data);
    //     // size++;
    //     if(head==null){
    //         head=tail=newNode;
    //         return;
    //     }
    //     //step 2- newNode.next=head
    //     newNode.next=head;//link
    //     //head=newNode
    //     head=newNode;
    // }
    // public void addLast(int data){
    //     Node newNode= new Node(data);
    //     // size++;
    //     if(head==null){
    //         head=tail=newNode;
    //         return;
    //     }
    //     tail.next=newNode;
    //     tail=newNode;
        
    // }
    // public void add(int index, int data){
    //     if(index==0){
    //         addFirst(data);
    //         return;
    //     }
    //     Node newNode=new Node(data);
    //     // size++;
    //     Node temp= head;
    //     int i=0;
    //     if(i<index-1){
    //         temp=temp.next;
    //         i++;
    //     }
    //     newNode.next=temp.next;
    //     temp.next=newNode;
        
        
    // }
    public void print(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        //detect cycle
        Node slow= head;
        Node fast=head;
        boolean cycle= false;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast=fast.next.next;
            if(fast==slow){
                cycle= true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        slow=head;
        Node prev= null;//last Node
        while(slow!=fast){
            prev=fast;
            slow= slow.next;
            fast=fast.next;
        }
        prev.next= null;
    }
   
    public static void main(String[]args){
        head=new Node(1);
        Node temp= new Node(2);
        head.next= temp;
        head.next.next=new Node(3);
        head.next.next.next=temp;
         System.out.println(isCycle());
        removeCycle();
         System.out.println(isCycle());
       
    
       
    }
}