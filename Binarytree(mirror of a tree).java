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
    public static Node invert(Node root){
        if(root==null){
            return null;
        }
        Node temp=root.left;
        root.left= root.right;
        root.right=temp;
        
        invert(root.left);
        invert(root.right);
        
        return root;
    }
    
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    
    public static void main(String[]args){
        Node root= new Node(1);
        root.left= new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        
        root= invert(root);
        inorder(root);
        
        
    }
}
