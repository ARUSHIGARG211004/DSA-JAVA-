//implementation of queue using Array 
import java.util.*;
public class Queue{
    static class queue{
        static int arr[];
        static int size;
        static int rear;
        
        queue(int n){
            arr=new int[n];
            rear=-1;
            size=n;
        }
        public static boolean isEmpty(){
            return rear==-1;
        }
        
        //add 
        public static void add(int data){
            if(rear==size-1){//if rear is full
            System.out.println("queue is full");
            return;
            }
             rear=rear+1;
             arr[rear]=data;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return-1;
            }
            int front=arr[0];
            for(int i=0;i<rear;i++){
                arr[i]=arr[i+1];
            }
            rear=rear-1;
            return front;
        }
        //peek
        public static int peek(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return-1;
        }
        return arr[0];
        }
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the queue:");
        int size= sc.nextInt();
        queue q= new queue(size);
        
        //add
        for(int i=0;i<size;i++){
            System.out.print("Enter element"+(i+1)+":");
            int data= sc.nextInt();
            q.add(data);
        }
        
        //remove
        while(!q.isEmpty()){
            System.out.println("Peeked element:"+q.peek());
            System.out.println("Removed element:"+q.remove());
        }
       
        
        
        
        
        
    }
    
}