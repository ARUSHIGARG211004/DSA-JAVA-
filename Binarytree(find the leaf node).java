import java.util.*;
public class Binarytree{
    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
        
    }
    
    public static void leaf(Node root){
        if(root==null){
            return;
        }
        
        
        if(root.left==null && root.right==null){
            
            System.out.print(root.data+" ");
        }
        leaf(root.left);
        leaf(root.right);
    }
    
    public static void main(String[]args){
        Node root= new Node(1);
        root.left= new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        
        leaf(root);
    }
}
